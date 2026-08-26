import java.util.Scanner;
class DisplayNum{
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        while(num>0){
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        while(rev>0){
            int digit=rev%10;
            switch (digit){
                case 0:System.out.print(" ZERO");break;
                case 1:System.out.print(" ONE");break;
                case 2:System.out.print(" TWO");break;
                case 3:System.out.print(" THREE");break;
                case 4:System.out.print(" FOUR");break;
                case 5:System.out.print(" FIVE");break;
                case 6:System.out.print(" SIX");break;
                case 7:System.out.print(" SEVEN");break;
                case 8:System.out.print(" EIGHT");break;
                case 9:System.out.print(" NINE");break;
            }
            rev=rev/10;
        }
        System.out.println();
    }
}
