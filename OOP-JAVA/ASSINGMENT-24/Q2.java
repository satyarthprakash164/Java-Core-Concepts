class MyRunnable implements Runnable{
    String name;
    public MyRunnable(String name){
        this.name=name;
    }
    public void run(){
        try{
            for(int i=1;i<=3;i++){
                System.out.println(name+" is running-Step "+i);
                Thread.sleep(5000);
            }
        } 
	catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Q2{
    public static void main(String[] args){
        Thread t1=new Thread(new MyRunnable("Runnable-1"));
        Thread t2=new Thread(new MyRunnable("Runnable-2"));
        t1.start();
        t2.start();
    }
}