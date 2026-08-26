class SeriesA {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); 
        double sum = 0.0;

        System.out.println("Series: ");
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println("1/" + i);
            if (i < n) System.out.print(" + ");
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}