import java.util.Scanner;

public class Day8_Prefixsum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Build prefix array
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.print("Enter L and R: ");
            int L = sc.nextInt();
            int R = sc.nextInt();

            int sum;

            if (L == 0) {
                sum = prefix[R];
            } else {
                sum = prefix[R] - prefix[L - 1];
            }

            System.out.println("Sum: " + sum);
        }

        sc.close();
    }
}