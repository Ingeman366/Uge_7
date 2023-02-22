package opgave4test;

public class FibonacciGenerator {
    public static int[] generate(int count){
        int[] fib = new int[count];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < count; i++) {
            fib[i]= fib[i-1] + fib[i -2];
        }
        return fib;
    }
}