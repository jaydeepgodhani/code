import java.util.*;

public class SortSelection {
    public static void main(String args[]) {
        int arr[] = new int[10];
        int i = 0, j = 0, length = arr.length, temp, var;
        Random rnd = new Random();

        for (i = 0; i < length; i++)
            arr[i] = rnd.nextInt(length);

        for (i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
        long startt = System.currentTimeMillis();
        // ****************************************** sorting started :)
        for (i = 0; i < length; i++) {
            var = 0;
            for (j = 0; j < length - i; j++) {
                if (arr[var] <= arr[j]) {
                    var = j;
                }
            }
            j--;
            temp = arr[j];
            arr[j] = arr[var];
            arr[var] = temp;
        }
        // ****************************************** sorting ended :)
        long endt = System.currentTimeMillis();

        for (i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("took " + (endt - startt));
    }
}