package OOPS.StudentManagementSystem;

public class Student {
   private int rollNo;
   private String name;
   private int age;
   private String course;
   private double marks;

    Student(int rollNo, String name , int age , String course, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    void displayStudent(){
        System.out.println("----------------------------");
        System.out.println("            Result          ");
        System.out.println("----------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("----------------------------");
    }
    int getRollNo(){
        return rollNo;
    }
    double getMarks(){
        return marks;
    }
    void setMarks(double marks){
        this.marks = marks;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}
