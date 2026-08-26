import java.util.Scanner;
class Complex{
    int real;
    int imag;
    Complex(){
		real=0;
		imag=1;
	}
    Complex(int r,int i){
        real=r;
        imag=i;
   }
    Complex(Complex c){
        real=c.real;
        imag=c.imag;
   }
    void showComplex(){
        System.out.println(real+"+"+imag+"i");
   }
    Complex addComplex(Complex c){
        return new Complex(real+c.real,imag+c.imag);
   }
    Complex substractComplex(Complex c){
        return new Complex(real-c.real,imag-c.imag);
   }
    Complex multiplyComplex(Complex c){
        int r=real*c.real-imag*c.imag;
        int i=real*c.imag+imag*c.real;
        return new Complex(r,i);
    }
}
class ComplexMain {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of c1:");
        int r1=sc.nextInt();
        System.out.print("Enter imag part of c1:");
        int i1=sc.nextInt();
        System.out.print("Enter real part of c2:");
        int r2=sc.nextInt();
        System.out.print("Enter imag part of c2:");
        int i2=sc.nextInt();
        Complex c1=new Complex(r1,i1);
        Complex c2=new Complex(r2,i2);
        Complex c3=new Complex(c1);
        System.out.println("c1:");
        c1.showComplex();
        System.out.println("c2:");
        c2.showComplex();
        System.out.println("c3(copy of c1):");
        c3.showComplex();
        System.out.println("Addition:");
        c1.addComplex(c2).showComplex();
        System.out.println("Subtraction:");
        c1.substractComplex(c2).showComplex();
        System.out.println("Multiplication:");
        c1.multiplyComplex(c2).showComplex();
    }
}