class Q1c {
    static long factorial(int k) {
        long f = 1;
        for(int i = 1; i <= k; i++) {
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0;
        
        for(int i = 1; i <= n; i++) {
            sum = sum + 1.0/factorial(i);
        }
        System.out.println("Sum = " + sum);
    }
}