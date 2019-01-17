import java.util.*;
//dynamic programming is same as this but save each element in array
//and sum previous two elements as next element. that's all mylord.
public class FibSimple {
    static int fib(int x) {
        if (x <= 1)
            return x;
        else
            return fib(x - 1) + fib(x - 2);
    }

    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        long start = System.currentTimeMillis();
        int ans = fib(sc.nextInt());
        long end = System.currentTimeMillis();
        System.out.println("Answer is : " + ans + " and it took " + (end - start) + " s");
    }
}