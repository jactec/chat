// Your First Program

class Print {

    public static void main(String[] args) {
        printFibonacci();
    }

    private static void printFibonacci() {
        int n = 10;
        long[] fib = generateFibonaccis(n);
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + ",");
        }
    }

    public static long[] generateFibonaccis(int n) {
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; ++i) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }
    
    private static void print1_100() {
        for(int i=1;i<=100;i=i+2) {  // revised print even numbers from 0-100
            System.out.println(i); 
        }
    }

}