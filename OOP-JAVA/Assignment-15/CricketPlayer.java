import java.util.*;
class CricketPlayer{
    String name;
    int no_of_innings;
    int times_of_notout;
    int total_runs;
    double bat_avg;
    static double avg(int runs,int innings,int notout){
    return (double)runs/(innings-notout); 
    }
static void sortPlayer(CricketPlayer p[],int n){
        for (int i=0;i<n-1;i++){
          for (int j=i+1;j<n;j++){
             if (p[i].bat_avg<p[j].bat_avg){
                CricketPlayer temp=p[i];
                 p[i]=p[j];
                 p[j]=temp;
              }
            }
         }
    }
	void display(){
	 System.out.println(name+" "+no_of_innings+" "+times_of_notout+" "+total_runs+" "+bat_avg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of players:");
        int n=sc.nextInt();
        sc.nextLine();
        CricketPlayer p[]=new CricketPlayer[n];
           for (int i=0;i< n;i++){
            p[i]=new CricketPlayer();
            System.out.println("Enter player name:");
            p[i].name=sc.nextLine();
            System.out.println("Enter innings:");
            p[i].no_of_innings=sc.nextInt();
            System.out.println("Enter not outs:");
            p[i].times_of_notout=sc.nextInt();
            System.out.println("Enter total runs:");
            p[i].total_runs=sc.nextInt();
            sc.nextLine();
            p[i].bat_avg=avg(p[i].total_runs,p[i].no_of_innings,p[i].times_of_notout);
    }
        sortPlayer(p,n);
        System.out.println("\nPlayers sorted by batting average:");
        for (int i=0;i<n;i++)
            p[i].display();
    }
}