import java.util.*;

public class SortMerge {
    static void merge(int arr[], int l, int m, int r) {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];

        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j++];
            }
            k++;
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    static void mergesort(int ar[], int a, int b) {
        if (a < b) {
            int m = (a + b) / 2;
            mergesort(ar, a, m);
            mergesort(ar, m + 1, b);
            merge(ar, a, m, b);
        }
    }

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
        mergesort(arr, 0, length - 1);
        // ****************************************** sorting ended :)
        long endt = System.currentTimeMillis();

        for (i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("took " + (endt - startt));
    }
}