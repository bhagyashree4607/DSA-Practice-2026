public class Day2_Secondlargest {

    public static int findSecondLargest(int[] arr) {

        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 7, 1, 9};

        int result = findSecondLargest(arr);

        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + result);
        }
    }
}
