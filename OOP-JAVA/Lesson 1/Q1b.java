class Q1b {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        double sum = 0;
        double power = 1;
        
        for(int i = 0; i <= n; i++) {
            sum = sum + 1.0/power;
            power = power * x;
        }
        System.out.println("Sum = " + sum);
    }
}