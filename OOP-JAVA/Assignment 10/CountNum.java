import java.util.Scanner;
class NumberArray{
    int[]arr;
    int n;
    NumberArray(){
        n=5;           
        arr=new int[n];
    }
    NumberArray(int size){
        n=size;
        arr=new int[n];
    }
    void readElements() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter "+n+"elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
    void countEvenOdd() {
        int even=0,odd=0;
        for (int x : arr){
            if (x%2==0)even++;
            else odd++;
        }
        System.out.println("Even numbers="+even);
        System.out.println("Odd numbers="+odd);
    }
}
class CountNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=sc.nextInt();
        NumberArray obj=new NumberArray(size);
        obj.readElements();  
        obj.countEvenOdd();  
    }
}