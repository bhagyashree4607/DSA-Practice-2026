Day1:
Problem: Reverse an array in-place.

Approach:
-Used Two Pointer technique

-One pointer starts from beginning and one from end

-Swap elements and move  both pointers towards center.

Time Complexity: O(n)
Space Complexity: O(1)

Concept Used:
-Two Pointer Technique
,In-place modification

-------------------------------------------------------------------------------------------------

Day2:
Problem: Find the second largest element in an array.

Approach:
-Used two variables to track largest and secondLargest.

-Traverse the array once.

-If current element > largest:

    Update secondLargest = largest
    Update largest = current element

-Else if current element > secondLargest AND not equal to largest:
    Update secondLargest

Time Complexity: O(n)

Space Complexity: O(1)

Concept Used:
-Single pass traversal
,Variable tracking
,Comparison logic

------------------------------------------------------------------------

Day4:
Problem:

Move all zeros in the array to the end while maintaining the order of non-zero elements.

Approach:

Use Two Pointer technique.

Traverse the array once.

Keep a pointer j to track position of next non-zero element.

Whenever you find a non-zero element:

Swap it with element at index j

Increment j

Steps:

Initialize j = 0

Traverse array from i = 0 to n-1

If arr[i] != 0

Swap arr[i] and arr[j]

Increment j

Time Complexity:

O(n)

Space Complexity:

O(1)

Concept Used:

Two Pointer Technique,
In-place array modification,
Single pass traversal

---------------------------------------------------------------------------------------------------------------------------

Day5:
Problem:

Left rotate an array by one position.

Approach:

Store the first element in a temporary variable.

Traverse the array from index 0 to n-2.

Shift each element one position to the left.

Place the stored first element at the last index.

-If current index < n-1:

  Update arr[i] = arr[i+1]

-After loop ends:

  Update arr[n-1] = first element

Time Complexity: O(n)
Space Complexity: O(1)
Concept Used:


--------------------------------------------------------------------------------------

Day6:
Problem:

Find the maximum sum of a contiguous subarray in a given array (array may contain negative numbers).

Approach:

Used Kadane’s Algorithm.

Maintained two variables:

currentSum

maxSum

Traverse the array once.

Add each element to currentSum.

If currentSum becomes greater than maxSum, update maxSum.

If currentSum becomes negative, reset it to 0.

-If currentSum > maxSum:

  Update maxSum

-If currentSum < 0:

  Reset currentSum = 0

Time Complexity: O(n)
Space Complexity: O(1)
Concept Used:

Single pass traversal

Greedy approach

Kadane’s Algorithm

Dynamic thinking

-----------------------------------------------------------------------------------------------------

Day7:
Problem:

Given an array representing stock prices on different days, find the maximum profit that can be achieved by buying on one day and selling on a later day.

If no profit is possible, return 0.

Approach:
Used a greedy approach.

Maintained two variables:
minPrice → stores minimum price seen so far.
maxProfit → stores maximum profit found.
Traverse the array once.
If current price is less than minPrice, update minPrice.
Calculate profit = current price − minPrice.
If calculated profit is greater than maxProfit, update maxProfit.
-If currentPrice < minPrice:
  Update minPrice
-Calculate profit = currentPrice − minPrice

-If profit > maxProfit:
  Update maxProfit

Time Complexity: O(n)
Space Complexity: O(1)

Concept Used:
Single pass traversal

Greedy algorithm

Minimum value tracking

Real-world stock optimization logic

--------------------------------------------------------------------------------------------------------------------------

Day8:

Problem:

Given an array and multiple queries, find the sum of elements between index L and R (inclusive) efficiently.

Approach:
Used Prefix Sum technique for optimization.
Created a new array prefix[] where:
  prefix[i] stores sum of elements from index 0 to i.

First element:
  prefix[0] = arr[0]
For remaining elements:
  prefix[i] = prefix[i-1] + arr[i]
For each query (L, R):
  If L == 0 → Sum = prefix[R]
  Else → Sum = prefix[R] − prefix[L-1]
-Precompute prefix array in O(n)
-Answer each query in O(1)

Time Complexity:
Building prefix array → O(n)
Each query → O(1)
Overall → O(n + q)

Space Complexity:
O(n)

Concept Used:
Precomputation
Range query optimization
Time complexity reduction
Prefix Sum technique

---------------------------------------------------------------------------------------------------

Day9:

Problem:
Given an array and an integer k, find the maximum sum of any contiguous subarray of size k.

Approach:
Used Sliding Window technique for optimization.
First, calculated sum of first k elements (initial window).
Stored it as windowSum.
Set maxSum = windowSum.
Then slid the window one element at a time:
  Subtract element going out of window
  Add new element coming into window
Updated maxSum whenever a larger sum was found.
-Initial window sum calculated in O(k)
-For each step:
  windowSum = windowSum − arr[i − k] + arr[i]
-Update maxSum if windowSum > maxSum

Time Complexity:
O(n)

Space Complexity:
O(1)

Concept Used:
Sliding Window Technique
Optimization from O(n × k) to O(n)
Contiguous subarray logic
Efficient window shifting

-----------------------------------------------------------------------------------------------

Day10:

Problem:
Given an array of positive integers and a target sum S, find the length of the longest contiguous subarray whose sum equals S.

Approach:
Used Sliding Window (Two Pointer Technique).

Maintained two pointers:
  left → start of window
  right → end of window
Added elements while expanding window.
If sum becomes greater than target:
  Shrink window from left side.
If sum equals target:
  Update maximum length.

Key Logic:
Expand window → sum += arr[right]
While sum > target:
  sum -= arr[left]
  left++
If sum == target:
  maxLength = max(maxLength, right - left + 1)

Time Complexity:
O(n)
Each element is added and removed at most once.

Space Complexity:
O(1)
Only variables are used, no extra data structure.

Concept Used:
Sliding Window
Two Pointer Technique
Contiguous Subarray
Window Shrinking & Expanding

Important Note:
This approach works only for positive integers.
If negative numbers are present, we need Prefix Sum + HashMap approach.

-----------------------------------------------------------------------------------------------