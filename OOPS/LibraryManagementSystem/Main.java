package OOPS.LibraryManagementSystem;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Library b1 = new Library();
        int choice;
        do{
            System.out.println("======== Library Management System =========");
            System.out.println("Welcome to the St.Andrew's Library");
            System.out.println("1. Add Books : ");
            System.out.println("2. Display Books : ");
            System.out.println("3. Search Book : ");
            System.out.println("4. Issue Book : ");
            System.out.println("5. Return Book : ");
            System.out.println("6. Exit : ");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    b1.addBook(sc);
                    break;
                case 2:
                    b1.displayBooks();
                    break;
                case 3:
                    b1.searchBooks(sc);
                    break;
                case 4:
                    b1.issueBook(sc);
                    break;
                case 5:
                    b1.returnBook(sc);
                    break;
                case 6:
                     System.out.println("Thank You for using Library management System!");
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
        while(choice!= 6);
        sc.close();
    }
}
