import java.util.*;

public class Day11 {
    public static boolean subarrayWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum == target)
                return true;

            if (set.contains(prefixSum - target))
                return true;

            set.add(prefixSum);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean result = subarrayWithSum(arr, target);

        if (result)
            System.out.println("Subarray exists");
        else
            System.out.println("Subarray does not exist");

        sc.close();
    }
}