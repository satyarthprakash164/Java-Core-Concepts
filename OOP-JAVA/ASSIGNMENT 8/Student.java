import java.util.Scanner;
class Student{
    int rollNo;
    String name;
    int m1,m2,m3;
    int total;
    double percentage;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No:");
        rollNo=sc.nextInt();
        System.out.print("Enter Name:");
        name=sc.next();
        System.out.print("Enter marks in 3 subjects:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void calculate(){
        total=m1+m2+m3;                  
        percentage=total/3.0;
    }
    void display(){
        System.out.println("-----Student Report-----");
        System.out.println("Roll No:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Marks:"+m1+","+m2+","+m3);
        System.out.println("Total:"+total);
        System.out.println("Percent:"+percentage+"%");
	}
}
class StudentMain{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        System.out.println("Enter details for Student 1");
        s1.input();
        s1.calculate();
        System.out.println("Enter details for Student 2");
        s2.input();
        s2.calculate();
        s1.display();
        s2.display();
    }
}