import java.util.Scanner;

public class Day9_MaxSumSubarray {

    public static int maxSum(int[] arr, int k) {

        int n = arr.length;

        int windowSum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide window
        for (int i = k; i < n; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = maxSum(arr, k);

        System.out.println("Maximum Sum of Subarray of size " + k + " is: " + result);

        sc.close();
    }
}