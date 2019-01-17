import java.util.*;

public class FibSave {
    
    static long fib(int x) {
        long a = 0, b = 1, c = 0;
        int i = 0;
        if (x <= 1)
            return x;
        else {
            while (i++ < x - 1) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        return c;
    }

    public static void main(String arrgs[]) {
        Scanner sc = new Scanner(System.in);
        int ans1 = sc.nextInt();
        long start = System.currentTimeMillis();
        long ans = fib(ans1);
        long end = System.currentTimeMillis();
        System.out.println("Answer is : " + ans + " and it took " + (end - start) + " s");
    }
}