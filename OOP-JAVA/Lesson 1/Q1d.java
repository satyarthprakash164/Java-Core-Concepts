class Q1d {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long sum = 0;
        for(int i = 1; i <= n; i++) {
            long term;
            if(i % 2 == 0) {
                term = i * i * i; 
            } else {
                term = i * i; 
            }
            sum = sum + term;
        }
        System.out.println("Sum = " + sum);
    }
}