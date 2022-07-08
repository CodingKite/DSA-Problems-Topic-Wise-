// Time complexity is BigO(log n) bcuz our search space is reducing the half in each iteration.

import java.util.Scanner;
import java.util.Arrays;

public class _1_binarySearch{


  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int[] arr = arrayCreation(scn);

    System.out.print("Enter the number to find in the array: ");
    int x = scn.nextInt();
    scn.close();
  
    //linear serach
    int index = linearSearch(arr,x);

    //binary search
    int index = binarySearch(arr,x);

    //binary search using recursion
    int index = binarySearchUsingRecursion(arr,0,arr.length-1,x);

    if(index == -1){
      System.out.printf("%d NOT found in array\n",x);
    }else{
      System.out.printf("%d found in array at %d \n",x,index);
    }
  }




  static int[] arrayCreation(Scanner scn){
    //Array size input
    System.out.print("Enter the number of element: ");
    int size = scn.nextInt();

    //Array creation
    int[] arr = new int[size];
    
    //Adding values in the array
    System.out.printf("Enter %d values in an sorted order: \n",size);
    for(int i=0;i<size;i++){
      arr[i]= scn.nextInt();
    }
    
    System.out.println("Array is :" + Arrays.toString(arr));

    return arr;
  }




  static int linearSearch(int[] arr,int x){
    //Linear Search
    for(int i=0; i < arr.length;i++){
      if(x == arr[i]){
        return i;
      }
    }

    return -1;
  }




  static int binarySearch(int[] arr,int x){
    int low = 0;;
    int high = arr.length-1;
    int mid;

    while(low <= high){
      mid = low + ((high - low)/2);

      // System.out.println("LOW "+ low+ " high "+high+ " mid "+mid);

      if(arr[mid] == x) return mid;
      else if(x > arr[mid]){
        low = mid + 1;
      }else{
        high = mid - 1;
      }

      // System.out.println("ADJUSTED ------- "+"LOW "+ low+ " high "+high+ " mid "+mid);

    }

    return -1;
  }





  //anything we can do with iteration can be done by recursion and vice-versa.
  // In case of recusrion we need to store the states of these functions in the memory and hence the iterative solution is more performant.
  static int binarySearchUsingRecursion(int[] arr,int start,int end,int x){

    // two base conditions
    //first base condition... when we dont find the number in the whole array 
    if(start > end){
      return -1;
    }

    int mid = start + ((end - start)/2);

    //second base condition... when we find the number in the array
    if(x == arr[mid]){
      return mid;
    }else if(x < arr[mid]){
      return binarySearchUsingRecursion(arr, start, mid-1,x);
    }else{
      return binarySearchUsingRecursion(arr, mid+1, end, x);
    }
  }

}

