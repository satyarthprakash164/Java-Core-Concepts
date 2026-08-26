import java.util.*
public class QE{
    public static void main(String[]args){
        int a=1;
        int b=2;
        int c=5;
        double d=(b*b)-(4*a*c);
        double r1,r2;
        double ds=Math.sqrt(Math.abs(d));
        if(d>0){
            r1=(-b+ds)/(2*a);
            r2=(-b-ds)/(2*a);
            System.out.println("Root1:"+r1+"\nRoot2: "+r2);
        }
        else if(d==0){
            r1=(-b)/(2*a);
            r2=r1;
            System.out.println("Root1: "+r1+"\nRoot2: "+r2);
        }
        else{
            r1=(-b)/(2*a);
            r2=(ds)/(2*a);
            System.out.println("Root1:"+r1+"+"+r2+"i");
            System.out.println("Root1:"+r1+"-"+r2+"i");
}
}    
}