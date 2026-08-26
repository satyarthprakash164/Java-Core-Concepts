import java.util.Scanner;
class FourDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Numbers where(first 2 digits + last 2 digits)^2 = original:");
        for(int num=1000;num<=9999;num++){
            int first2=num/100;
            int last2=num%100;
            if((first2+last2)*(first2+last2)==num){
                System.out.println(num);
            }
        }
    }
}