import java.util.Scanner;
import java.util.Arrays;

public class _2_bubbleSort{
  public static void main(String[] args){

    _2_bubbleSort obj = new _2_bubbleSort();
    // int[] arr = obj.arrayCreation();
    // int[] arr = {10,4,1,33,0,54,22,6,7};
    int[] arr = {10,9,8,7,6,5,4,3,2,1};

    System.out.println("UN-Sorted array ==> "+ Arrays.toString(arr));

    // obj.bubbleSort(arr);
    obj.bubbleSort_Optimized(arr);
  
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

  void bubbleSort(int[] arr){

    int temp; 
    //outter loop - number of passses
    for(int j = 0; j <= arr.length-1; j++){
      // inner loop - swapping elements in each pass
      for(int i=0; i <= arr.length-2; i++){ // no need to go to the sorted path
      // for(int i=0; i < arr.length-1-j; i++){
        // System.out.println(i);
        if(arr[i]> arr[i+1]){
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }

  }

  void bubbleSort_Optimized(int[] arr){
    int temp; 
    //outter loop

    for(int j = 0; j <= arr.length-2; j++){
      int flag = 0;
      for(int i=0; i <= arr.length-2-j; i++){ // no need to go to the sorted path
        if(arr[i]> arr[i+1]){
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          flag = 1;
        }
      }

      //flag makes sure to not run loops further, when there is no need of sorting or the array is sorted
      if(flag == 0) break;

    }

  }
}