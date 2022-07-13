## Selection Sort
- First select the minimum element and then bring it to the left of the array(by swapping).
- Keep on doing it until the whole array is sorted.
- Time Complexity ---> BigO(n square)
  ![](./images/Screenshot%20from%202022-07-12%2006-14-37.png)
  ![](./images/Screenshot%20from%202022-07-12%2006-15-56.png)
  ![](./images/Screenshot%20from%202022-07-12%2006-16-42.png)
- In-place sorting algorithm takes constant amount of extra space.


# Bubble Sort
- Pass is one scan over the whole array.
- With each pass, array will be deivided into two parts, the sorted & unsorted parts.
- In bubble sort with each pass, the largest element in the unsroted half will bubble up to the highest index in the sorted half.
  ![](./images/Screenshot%20from%202022-07-12%2007-17-21.png)
- Time Complexity
  ![](./images/Screenshot%20from%202022-07-12%2007-18-34.png)
- Best Case for Bubble Sort => When array is already sorted, time complexity BigO(n)
- Average Case for Bubble Sort => Time complexity BigO(n square)
- Worst Case for Bubble Sort => Time complexity BigO(n square)

# INSERTION SORT
- We consider the one part as sorted, then look for the next element, if it is smaller then the previous element then we swap them.We keep shiffting(in the sorted part) until it finds is correct position.
  - ![](images/Screenshot%20from%202022-07-13%2006-07-54.png)
  - There will be time when the hole will not move simply bcuz it is at its appropriate position.
- Time Complexity
  - BEST CASE: BigO(n) when array is sorted, we will not go inside the while loop even once.
  - ![](images/Screenshot%20from%202022-07-13%2006-21-59.png)
  - WORST CASE: BigO(n square)  Reverse sorted array
  - ![](images/Screenshot%20from%202022-07-13%2006-23-13.png)
  - ![](images/Screenshot%20from%202022-07-13%2006-24-29.png)
  - AVERAGE CASE: BigO(n square)
  - ![](images/Screenshot%20from%202022-07-13%2006-25-34.png)
- Even though time complexity of insertion sort is BigO(n square) in the worst and average case.The number of comparison and shifts in insertion sort(in all practical scenario) is lot less than the selection and bubble sort.

# MERGE SORT
- ![](images/Screenshot%20from%202022-07-13%2009-51-19.png)