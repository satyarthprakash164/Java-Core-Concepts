class BankAccount{
    int no;
    String name;
    double bal;
    BankAccount(int Acc_no,String name,double balc){
        no=Acc_no;
        name=name;   
        bal=balc;
    }
    void deposit(double amt){
        bal+=amt;
        System.out.println("New balance:"+bal);
    }
    void withdraw(double amt){
        if(bal<amt) 
		System.out.println("Error:insufficient balance");
        else{
            bal-=amt;
            System.out.println("New balance:"+bal);
        }
    }
    void display_balance(){
        System.out.println("Balance:"+bal);
    }
}
public class a2{
    public static void main(String[] args){
        BankAccount b1=new BankAccount(222,"ROSS",5500);
        b1.display_balance();
        b1.deposit(500);
        b1.withdraw(800);
    }
}
