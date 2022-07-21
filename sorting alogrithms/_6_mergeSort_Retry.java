import java.util.Arrays;
public class _6_mergeSort_Retry{
  public static void main(String[] args){
    int[] arr = {10,9,8,7,6,5,4,3,2,1};

    int[] final_arr = mergeSortAlgo(arr);
    System.out.println("FINALL ARRAY ==> "+Arrays.toString(final_arr));
  }

  static int[] mergeSortAlgo(int[] arr){
    
    if(arr.length < 2){
        return arr;
    }

    //find mid
    int mid = arr.length/2; //10/2
    int[] left_arr = new int[mid]; //5
    int[] right_arr = new int[arr.length-mid];

    for(int i=0; i < left_arr.length; i++){
      left_arr[i] = arr[i];
    }

    for(int j=0; j< right_arr.length; j++){
      right_arr[j] = arr[mid+j];
    }

    System.out.println("left_Arr"+Arrays.toString(left_arr));
    System.out.println("right_Arr"+Arrays.toString(right_arr));
    System.out.println("============================================");

    int[] return_left_arr = mergeSortAlgo(left_arr);
    int[] return_right_arr = mergeSortAlgo(right_arr);
     System.out.println("return_left_arr"+Arrays.toString(return_left_arr));
    System.out.println("return_right_arr"+Arrays.toString(return_right_arr));

    return mergeArray(arr,return_left_arr,return_right_arr);
  }

  static int[] mergeArray(int[] arr,int[] return_left_arr,int[] return_right_arr){
    System.out.println("ARRAY BEDFFFORE MERGE ==> "+ Arrays.toString(arr));
    System.out.println("ARRAY bf return_left_arr MERGE ==> "+ Arrays.toString(return_left_arr));
    System.out.println("ARRAY of return_right_arr MERGE ==> "+ Arrays.toString(return_right_arr));
    int nL = return_left_arr.length;
    int nR = return_right_arr.length;

    int i=0;
    int j=0;
    int k=0;

    while(i<nL && j<nR){
      if(return_left_arr[i] < return_right_arr[j]){
        arr[k] = return_left_arr[i];
        i++;
        k++;
      }else{
        arr[k] = return_right_arr[j];
        j++;
        k++;
      }
    }

    //if some data is left in any of the array
    while(i<nL){
      arr[k] = return_left_arr[i];
        i++;
        k++;
    }

     while(j<nR){
      arr[k] = return_right_arr[j];
        j++;
        k++;
    }

    System.out.println("ARRAY AFTER MERGE ==> "+ Arrays.toString(arr));

    return arr;
    
  }
  
}