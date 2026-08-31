package OOPS.LibraryManagementSystem;
import java.util.*;
public class Library {
    Book books[] = new Book[100];
    int count=0; 
    void addBook(Scanner sc){
        System.out.print("Enter Book Id : ");
        int bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Name : ");
        String  bookName = sc.nextLine();
        System.out.print("Enter Author : ");
        String author = sc.nextLine();
        System.out.print("Enter Price : ");
        int price = sc.nextInt();

        Book b1 = new Book(bookId, bookName, author, price);
        books[count] = b1;
        count++;
    }   
    void displayBooks(){
        if(count==0){
            System.out.println("No Records Found! ❌");
            return;
        }
        for(int i=0;i<count;i++){
            books[i].displayBook();
        }
    }
    void searchBooks(Scanner sc){
        System.out.print("Enter Book ID : ");
        int bookId = sc.nextInt();
        if(count == 0){
            System.out.println("No Books Found! ❌");
            return;
        }
        for(int i=0;i<count;i++){
            if(books[i].getBookId() == bookId){
                books[i].displayBook();
                return;
            }
        }
        System.out.println("Book Not Found! ❌");
    }
    void issueBook(Scanner sc){
        System.out.print("Book ID : ");
        int bookId = sc.nextInt();
        System.out.println("Status : " );
        for(int i=0;i<count;i++){
            if(books[i].getBookId() == bookId){
                if(books[i].isIssued()){
                    System.out.println("Book is Already Issued!❌");
                }else{
                    books[i].setIssued();
                    System.out.println("Available");
                    System.out.println("Book Issued Successfully!✅");
                }
                return;
            }
        }
    }
    void returnBook(Scanner sc){
        System.out.print("Enter Book ID : ");
        int bookId = sc.nextInt();
        for(int i=0;i<count;i++){
            if(books[i].getBookId() == bookId){
                if(books[i].isIssued()){
                    books[i].setReturned();
                System.out.println("Book Returned Succesfully!✅");
                }else{
                    System.out.println("Book is already available!❌");
                }
            }
        }
    }
}
