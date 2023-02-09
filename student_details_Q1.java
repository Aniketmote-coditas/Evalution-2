package Evalution_2;
class Student{
    int id =11;
    String firstName = "Aniket";
    String lastName = "Mote";
    String education = "Be";
    String city = "city";
    int marks = 75;
}
public class student_details_Q1 {
    public static void main(String[] args){
        Student student = new Student();
        int marks = student.marks;
        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println(student.city);
        System.out.println(student.education);
        if(marks>=70){
            System.out.println("Distinction");
        }else if(marks>=60 && marks<70){
            System.out.println("first class");
        }else if(marks>=55 && marks<60){
            System.out.println("Higher Second class");
        }else if(marks>=50 && marks<55){
            System.out.println("Second class");
        }else if(marks>=35 && marks<50){
            System.out.println("pass class");
        }else{
            System.out.println("Fail");
        }

    }
}
/* output
Aniket
Mote
city
Be
Distinction
 */