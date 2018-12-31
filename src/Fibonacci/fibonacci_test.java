package Fibonacci;

public class fibonacci_test {
    public static void main (String[] args) {
        fibonacci fibo = new fibonacci(new long[] {1, 1}, 150);
        System.out.println(fibo.run());
    }
}
