import java.util.Scanner;
class Student{
    int roll_no;
    String name;
    String course_name;
    double fees;
    Student(){
        roll_no=2680900;
        name="Ross";
        course_name="MCA";
        fees=120000.0;
    }
    Student(int r,String n,String c,double f){
        roll_no=r;
        name=n;
        course_name =c;
        fees=f;
    }
    Student(Student s){
        roll_no=s.roll_no;
        name=s.name;
        course_name=s.course_name;
        fees=s.fees;
    }
    void display(){
        System.out.println("Roll No:"+roll_no);
        System.out.println("Name:"+name);
        System.out.println("Course Name:"+course_name);
        System.out.println("Fees:"+fees);
        System.out.println("---------------------------");
    }
}
class StudentMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Student 1 (Default constructor):");
        Student s1=new Student();
        s1.display();
        System.out.println("Student 2(Parameterized constructor-Enter data):");
        System.out.print("Enter Roll No:");
        int r=sc.nextInt();
        System.out.print("Enter Name:");
        String n=sc.next();
        System.out.print("Enter Course Name:");
        String c=sc.next();
        System.out.print("Enter Fees:");
        double f=sc.nextDouble();
        Student s2 = new Student(r,n,c,f);
        System.out.println();
        s2.display();
        System.out.println("Student 3(Copy constructor - copy of Student 2):");
        Student s3 = new Student(s2);
        s3.display();
    }
}