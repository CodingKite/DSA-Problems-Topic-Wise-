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
- Merge sort is a divide and conquer algorithm that has worst case time complexity of O(nlogn).
- ![](images/Screenshot%20from%202022-07-13%2009-51-19.png)
- ![](images/Screenshot%20from%202022-07-14%2018-53-58.png)
- ![](images/Screenshot%20from%202022-07-14%2018-54-31.png)
- ![](images/Screenshot%20from%202022-07-14%2018-54-50.png)
- ![](images/Screenshot%20from%202022-07-14%2018-55-16.png)
- ![](images/Screenshot%20from%202022-07-14%2018-56-20.png)
  
## Merge Sort Properties

- Merge sort is a divide and conquer algorithm that has worst case time complexity of O(nlogn).
- Divide & Conquer
  - Merge sort falls in the class of algorithms that we call divide and conquer algorithms.
  - In divide and conquer strategy, we break a problem into sub-problems and then we first find out the solutions to sub-problems and from solutions to sub-problems we construct the solution of the actual problem.
- Recursive Algoritm
  - Merge sort algorithm is that its a recursive algorithm.
  - Programmatically, recursion is a function calling itself, but generally recursion is problem reducing itself in a self-similar manner.
- Stable Algorithm
  - Merge sort is also a stable sorting algorithm.
  - When we explain a sorting algorithm, we try to sort a list of integers in increasing order of value, but a sorting algorithm can be applied to a collection of any data type.
  - When we are sorting complex records, we sort them on the basis of some property or some key. 
  - For example, lets say we want to sort points in Cartesian plane where each point is given as a pair of integers with x and y coordinates and we want to sort this list in increasing order of x coordinate. 
  - So, the key here is x coordinate.
  - For this list, there can be 2 possible sorted arrangements. We have 2 records, 2 points that have equal x coordinate. So, in the sorted arrangement, either of these could come first.
  - But, in a stable sorting algorithm, the relative order of records with the same key is preserved. - So, if (2,5) is occurring before (2,3) in the original list, (2,5) must also occur before (2,3) in the sorted arrangement.
  - Merge sort is a stable sorting algorithm. So, it preserves the relative order of records with same key.
  - ![](images/Screenshot%20from%202022-07-14%2019-07-28.png)
- Merge Sort is NOT an In-Place sorting algorithm
  - An in-place sorting algorithm takes constant amount of extra memory to sort a list.
  - Previous sorting algorithms like bubble sort, insertion sort and selection sort, all of them were using only some temporary variables to store indices, the extra space taken was not dependent upon the size of the list.
  - But in merge sort, when we divide an array into sub-lists , two sub-lists - left and right, we create two entirely new arrays.
  - So, definitely the amount of extra space that we will take will be proportional to the size of the list, the number of elements in the list.
  - The space complexity of merge sort is big-oh of n.
  - In fact we should say theta n. Technically theta notation is what we should be using most of the time, but because big-oh notation is more famous, we use big-oh notation.
  - What this means in simple terms is the memory or the space consumption is proportional to the number of elements in the list.
- Time Complexity
  - The time complexity of merge sort algorithm is big-oh of n*logn in worst case.
  - ![](images/Screenshot%20from%202022-07-14%2019-12-37.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-16-11.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-16-53.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-18-44.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-20-13.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-23-11.png)
  - ![](images/Screenshot%20from%202022-07-14%2019-23-40.png)

# MERGE SORT
- ![](images/Screenshot%20from%202022-07-15%2002-29-16.png)
- Despite having a worst case running time of O(n2), Quick Sort is pretty fast and efficient in practical scenarios
- The worst-case running time of Quick Sort is almost always avoided by using what we call a randomized version of Quick Sort
- Randomized quick sort gives us O(nlogn) running time with very high probability.
- Quick Sort is often the most practical choice for an efficient sorting algorithm.
- In fact sort function given to us by most of the language libraries are implementations of Quick Sort only. 
