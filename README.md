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

