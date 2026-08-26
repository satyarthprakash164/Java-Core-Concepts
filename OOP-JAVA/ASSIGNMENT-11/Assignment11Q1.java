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
    void display(){
        System.out.println("2D Array("+m+"x"+n+"):");
        for(int i=0;i<m; i++){
           for(int j=0;j<n;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void displayRowWise(){
        System.out.println("Row-wise display:");
        for(int i=0;i<m;i++){
            System.out.print("Row"+(i+1)+":");
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Assignment11Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows(m):");
        int m=sc.nextInt();
        System.out.print("Enter columns(n):");
        int n=sc.nextInt();
        TwoDArray td=new TwoDArray(m,n);
        td.input();
        td.display();
        td.displayRowWise();
    }
}
