import java.util.Scanner;
import java.util.Arrays;


public class _2_firstLastOccurance {


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int[] arr = arrayCreation(scn);

    System.out.printf("Enter an number to find in the array \n");
    int num = scn.nextInt();
    scn.close();

    // int index = firstOcccurance(arr,num);
    // System.out.printf("First Occurance of %d in the array is %d \n",num,index);

    int index = lastOcccurance(arr,num);
    System.out.printf("Last Occurance of %d in the array is %d \n",num,index);
  }




  static int[] arrayCreation(Scanner scn){
    //Array size
    System.out.print("Enter the number of element: ");
    int size = scn.nextInt();

    //Array creation
    int[] arr = new int[size];

    //Adding values in the array
    System.out.printf("Enter %d values in an sorted order: \n",size);
    for(int i=0; i<size; i++ ){
      arr[i] = scn.nextInt();
    }

    return arr;
  }




  static int firstOcccurance(int[] arr,int num){
    // int index = firstOcccuranceIterative(arr,num);
    int index = firstOcccuranceRecursive(arr,0,arr.length-1,num,-1);
    return index;
  }




  static int lastOcccurance(int[] arr,int num){
    // int index = lastOccuranceIterative(arr,num);
    int index = lastOccuranceRecursive(arr,0,arr.length-1,num,-1);
    return index;
  }




  static int firstOcccuranceIterative(int[] arr,int num){

    int low = 0;
    int high = arr.length-1;
    int mid, index = -1;

    while(low <= high){
      mid = low + ((high-low)/2);

      if(num == arr[mid]) { 
        index = mid;
        high = mid - 1;
      }else if(num < arr[mid]){
        high = mid - 1;}
      else{
        low = mid + 1;
      }
    }

    return index;
  }




  static int firstOcccuranceRecursive(int[] arr,int low,int high,int num,int index){

    if(low > high) return index;

    int mid = low + ((high-low)/2);

    if(num == arr[mid]){
      return firstOcccuranceRecursive(arr, low, mid-1, num, mid);
    }else if(num > arr[mid]) { 
      return firstOcccuranceRecursive(arr,mid+1,high,num,index);
    }else{
      return firstOcccuranceRecursive(arr,low,mid-1,num,index);
    }

  }




  static int lastOccuranceIterative(int[] arr,int num){

    int low = 0;
    int high = arr.length-1;
    int mid;
    int index = -1;

    while(low <= high){
      
      mid = low + ((high-low)/2);

      if(num == arr[mid]){
        index = mid;
        low = mid + 1;
      }
      else if (num < arr[mid]){
        high = mid - 1;
      }else{
        low = mid +1;
      }

    }

    return index;
  }




  static int lastOccuranceRecursive(int[] arr,int low,int high,int num,int index){

    if(low > high){
      return index;
    }

    int mid = low + ((high-low)/2);

    if(num == arr[mid]){
      return lastOccuranceRecursive(arr, mid+1, high, num, mid);
    }else if(num < arr[mid]){
      return lastOccuranceRecursive(arr, low, mid-1, num, index);
    }else{
      return lastOccuranceRecursive(arr, mid+1, high, num, index);
    }
   
  }


}