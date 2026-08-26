import java.util.Scanner;
public class ArithmeticExceptionQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numerator:");
        int nume=sc.nextInt();
        System.out.print("Enter denominator:");
        int deno=sc.nextInt();
  try{
          int result=nume/deno;
          System.out.println("Result of division:"+result);
        } 
        catch(ArithmeticException e){
        System.out.println("ArithmeticException Caught:Cannot divide a number by zero!");
        }
        sc.close();
    }
}
  