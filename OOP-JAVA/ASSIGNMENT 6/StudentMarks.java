import java.util.Scanner;
class StudentMarks{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No:");
        int rollNo=sc.nextInt();
        System.out.print("Enter Name:");
        String name=sc.next();
        System.out.print("Enter marks in 5 subjects:");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        double percentage = (total/500.0)*100;
        String gradeStr = "";
        int percentageInt=(int)percentage;
        switch(percentageInt/10){
            case 10:
            case 9:
                gradeStr="O";
            break;
            case 8:
                gradeStr="E";
            break;
            case 7:
                gradeStr="A";
            break;
            case 6:
                gradeStr="B";
            break;
            case 5:
                gradeStr="C";
            break;
            case 4:
                gradeStr="D";
            break;
            default:
                gradeStr="Fail";
        }
        System.out.println("MARK SHEET");
        System.out.println("Roll No:"+ rollNo);
        System.out.println("Name:"+name);
        System.out.println("Total Marks: "+total+"/500");
        System.out.println("Percentage:"+ percentage +"%");
        System.out.println("Grade: "+gradeStr);
    }
}