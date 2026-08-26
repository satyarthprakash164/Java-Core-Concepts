class Armstrong{
    public static void main(String[]args){
        System.out.println("Armstrong numbers between 100 and 1000:");
        for(int n=100;n<1000;n++){
            int temp=n;
            int sum=0;
            while(temp!=0){
                int d=temp%10;
                sum+=d*d*d; 
                temp/=10;
             }
            if(sum==n)
                System.out.println(n);
}
}
}