import java.util.*;
class Account{
	int acct_no;
	String acct_type;
	String customer_name;
	double acct_balance;
	void input(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Account Number: ");
        acct_no=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Type:");
        acct_type=sc.nextLine();
        System.out.print("Enter Customer Name:");
        customer_name=sc.nextLine();
        System.out.print("Enter Balance: ");
        acct_balance=sc.nextDouble();
    }
	void display(){
        System.out.println(acct_no+" "+acct_type+" "+customer_name+" "+acct_balance);
}
    public static void main(String args[]) {
       Account a[]=new Account[5];
        for (int i=0;i<5;i++){
            a[i]=new Account();
            System.out.println("\nEnter details for customer"+(i + 1));
            a[i].input();
        }
        int maxIndex=0;
        for (int i=1;i<5;i++) {
            if (a[i].acct_balance>a[maxIndex].acct_balance)
                maxIndex = i;
        }
        System.out.println("\nCustomer with Maximum Balance:");
        a[maxIndex].display();
    }
}