import java.util.Scanner;
public class ArrayIndexExceptionQ2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array (n):");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+"values:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter an index to access (try entering "+n+ "or higher):");
        int index=sc.nextInt();
        try {
            System.out.println("Value at index"+index+"is:"+arr[index]);
        } 
	    catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        sc.close();
    }
}
