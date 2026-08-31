package OOPS.StudentManagementSystem;
import java.util.*;
public class StudentManagement {
    Student students[] = new Student[100];
    int count = 0;

    void addStudent(Scanner sc){
        System.out.print("Enter Roll Number : ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Course : ");
        String course = sc.nextLine();
        System.out.print("Enter Student Marks : ");
        double marks = sc.nextDouble();

        Student s1 = new Student(rollNo, name, age, course, marks);
        students[count] = s1;
        count++;
        System.out.println("Student Added Successfully!✅");
    }
    void displayStudents(){
        if(count==0){
            System.out.println("No Students Found!❌");
            return;
        }
        for(int i=0;i<count;i++){
            students[i].displayStudent();
        }
    }
    void searchStudents(Scanner sc){
        System.out.println("Enter Roll Number : ");
        int rollNo = sc.nextInt();
        if(count==0){
            System.out.println("No Students Found!❌");
            return;
        }
        for(int i=0;i<count;i++){
            if(students[i].getRollNo() == rollNo){
                students[i].displayStudent();
                return;
            }
        }
        System.out.println("No Match Found! ❌");
    }
    void updateStudents(Scanner sc){
        System.out.println("Enter Student Roll Number : ");
        int rollNo = sc.nextInt();
        if(count==0){
            System.out.println("No Students Found!❌");
            return;
        }
        for(int i=0;i<count;i++){
            if(students[i].getRollNo() == rollNo){
                System.out.println("Enter New Marks : ");
                double newMarks = sc.nextDouble();
                students[i].setMarks(newMarks);
                System.out.println("Marks Updated Successfully! ✅");
                return;
            }
        }
        System.out.println("Student Not Found! ❌");
    }
    void deleteStudents(Scanner sc){
        System.out.println("Enter Student Roll Number : ");
        int rollNo = sc.nextInt();
        if(count==0){
            System.out.println("No Students Found!❌");
            return;
        }
        for(int i=0;i<count;i++){
            if(students[i].getRollNo() == rollNo){
                for(int j=i;j<count-1;j++){
                    students[j] = students[j+1];
                }
                count--;
                students[count] = null;
                System.out.println("Student Deleted Succesfully! ✅");
                return;
            }
    }
    System.out.println("Student Not Found! ❌");
    }

}
