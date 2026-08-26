import java.util.Scanner;
class SearchArray{
    int[] a;
    int n;
    SearchArray(int size) 
	{
        n=size;
        a=new int[n];
    }
    void read() 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter"+n+"elements:");
        for (int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
    }
    void linearSearch(int key){
      int pos=-1;
      for (int i=0;i< n;i++){
        if (a[i]==key){
          pos=i;
           break;
        }
	}
	if (pos==-1)
            System.out.println("Element not found.");
       else
            System.out.println("Element found at position"+(pos+1));
   }
}
class LinearSearchArray{
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter size of array:");
      int n=sc.nextInt();
      SearchArray obj=new SearchArray(n); 
      obj.read();
      System.out.print("Enter element to search:");
      int key=sc.nextInt();
      obj.linearSearch(key);
   }
}