import java.util.Scanner;
class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter"+n+"elements:");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int even=0,odd=0;
        for (int x:a)
		{
            if (x%2==0)even++;
            else odd++;
        }
        System.out.println("Even numbers="+even);
        System.out.println("Odd numbers ="+odd);
    }
}