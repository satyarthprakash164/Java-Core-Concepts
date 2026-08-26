import java.util.Scanner;
class TwoDArray{
    int[][]arr;
    int m,n;
    TwoDArray(int rows,int cols){
        m=rows;
        n=cols;
        arr=new int[m][n];
    }
	void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter"+(m*n)+"elements:");
        for(int i=0;i<m;i++)
          for(int j=0;j<n;j++)
            arr[i][j]=sc.nextInt();
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter"+(m*n)+"elements:");
        for(int i=0;i<m;i++)
          for(int j=0;j<n;j++)
             arr[i][j]=sc.nextInt();
    }
    void split(OneDArray row1,OneDArray row2){
        for(int j=0;j<n;j++){
           row1.arr[j]=arr[0][j]; 
           row2.arr[j]=arr[1][j]; 
        }
    }
    void addRows(OneDArray row1,OneDArray row2){
        for(int j=0;j<n;j++){
            arr[0][j]+=row1.arr[j]+row2.arr[j];
        }
    }
    void display(){
       for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              System.out.print(arr[i][j]+" ");
           }
            System.out.println();
       }
   }
}