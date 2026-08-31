package OOPS.LibraryManagementSystem;
public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private int price;
    private boolean issued;

    Book(int bookId , String bookName, String author, int price){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.issued = false;
    }
    void displayBook(){
        System.out.println("------------------------------");
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Status : " + (issued ? "Issued" : "Available"));
    }
    int getBookId(){
        return bookId;
    }
    String getBookName(){
        return bookName;
    }
    void setIssued(){
        this.issued = true;
    }
    void setReturned(){
        this.issued = false;
    }
    boolean isIssued(){
        return issued;
    }
}
