import java.util.Scanner;
class RevArray{
    int[] a;
    int n;
    RevArray(int size)
	{
        n=size;
        a=new int[n];         
    }
    void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter"+n+"elements:");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
    void printReverse(){
       System.out.println("Array in reverse order:");
       for (int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
       System.out.println();
    }
}
class ReverseArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        RevArray obj=new RevArray(n);
        obj.read();
        obj.printReverse();
    }
}
