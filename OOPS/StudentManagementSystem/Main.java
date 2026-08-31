package OOPS.StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice;
        do{
        System.out.println("================================================");
        System.out.println("            Student Management System           ");
        System.out.println("================================================");
        System.out.println("1. Add Student");
        System.out.println("2. Display Student");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("Enter Choice : ");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                sm.addStudent(sc);
                break;
            case 2:
                sm.displayStudents();
                break;
            case 3:
                sm.searchStudents(sc);
                break;
            case 4:
                sm.updateStudents(sc);
                break;
            case 5:
                sm.deleteStudents(sc);
                break;
            case 6:
                System.out.println("Thank You for using Student management System!");
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
    }
        while(choice != 6);
        sc.close();

    }

}
