class MyThread extends Thread{
    public MyThread(String name){
       super(name);
   }
    public void run(){
       try{
           for(int i=1;i<=3;i++){
              System.out.println(getName()+" is running-Step"+i);
                Thread.sleep(5000);
            }
        } 
	catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Q1{
    public static void main(String[] args){
        MyThread t1=new MyThread("Thread-A");
        MyThread t2=new MyThread("Thread-B");
        t1.start();
        t2.start();
    }
}
