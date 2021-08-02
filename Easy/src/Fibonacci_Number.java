/**
 * 斐波那契数 动态规划
 */
public class Fibonacci_Number {
    //递归
    public static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n - 2);
    }
    public static int fib1(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for(int i = 2;i <= n;i++){
            p = q;
            q = r;
            r = p+q;
    }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib1(5));
    }
}
