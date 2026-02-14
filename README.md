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
-In-place modification

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
-Variable tracking
-Comparison logic
