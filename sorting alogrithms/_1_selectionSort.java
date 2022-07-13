/*LOGIC */
// fist select the minimum elements and then move it to the left.Keep on repeating the process until the second last element of the arrray.

import java.util.Scanner;
import java.util.Arrays;

public class _1_selectionSort{
  public static void main(String[] args) {
    
    _1_selectionSort obj = new _1_selectionSort();
    int[] arr = obj.arrayCreation();

    //various method
    
    // arr = obj.selection_Sort_Basic(arr);
    //since we passed the reference of arr, this function worked on the arr and sorted it.We need NOT assign it separately.
    // obj.selection_Sort_Original(arr);
    obj.selection_Sort_Original1(arr);

    System.out.println("Sorted array ==> "+ Arrays.toString(arr));

  } 

  int[] arrayCreation(){
    
    Scanner scn = new Scanner(System.in);
    System.out.printf("Enter the size of the array : ");
    int size = scn.nextInt();
    int[] arr = new int[size];
    System.out.printf("Enter %d values in the array :\n",size);
    for(int i=0; i<arr.length;i++){
      arr[i] = scn.nextInt();
    }
    scn.close();
    // System.out.println("Array ==> "+ Arrays.toString(arr));
    return arr;
  }


  int[] selection_Sort_Basic(int[] arr){

    int[] sorted_arr = new int[arr.length];

    for(int i = 0; i < sorted_arr.length; i++){
      
      int min_val = arr[0];
      int min_idx = 0;
      for(int j = 1; j < arr.length; j++){
        if(arr[j] < min_val){
          min_val = arr[j];
          min_idx = j;
        }
      }
      //inserting the minimum value at i index
      sorted_arr[i] = min_val;
      arr[min_idx] = 2147483647;
    }

    return sorted_arr;
  }

  void selection_Sort_Original(int[] arr){

    for(int i = 0; i < arr.length-2; i++){
      int min_val = arr[i];
      int min_idx = i;

      //pass - iterating over all the further elements for finding and selecting the min_val & min_idx
      for(int j = i+1; j < arr.length-1; j++){
        if(arr[j] < min_val){
          min_val = arr[j];
          min_idx = j;
        }
      }
      // System.out.println("Min_Val - "+ min_val+" min_idx - "+ min_idx);

      // swap it
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  void selection_Sort_Original1(int[] arr){

    for(int i = 0; i < arr.length-2; i++){
      int min_idx = i;

      //pass - iterating over all the further elements for finding and selecting the min_val & min_idx
      for(int j = i+1; j < arr.length-1; j++){
        if(arr[j] < arr[min_idx]){
          min_idx = j;
        }
      }
      // System.out.println("Min_Val - "+ min_val+" min_idx - "+ min_idx);

      // swap it
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  
}