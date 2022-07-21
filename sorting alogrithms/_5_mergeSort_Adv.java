import java.util.Arrays;
public class _5_mergeSort_Adv{
  public static void main(String[] args){
    // int[] arr = {10,9,8,7,6,5,4,3,2,1};
    int[] arr = {10,5,3,7,8,4,3,0,11,1,2,11};
    System.out.println("ORIGINAL ARRAY ==> "+Arrays.toString(arr));
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
    int[] right_arr = new int[arr.length-mid]; // 5

    //from 0 to 5 in arr
    for(int i=0; i < left_arr.length; i++){
      left_arr[i] = arr[i];
    }

    // from 6 to end in arr
    for(int j=0; j< right_arr.length; j++){
      right_arr[j] = arr[mid+j];
    }

    //two recursive calls
    int[] return_left_arr = mergeSortAlgo(left_arr);
    int[] return_right_arr = mergeSortAlgo(right_arr);

    //merging the two arrays correctly and then returning it
    return mergeArray(arr,return_left_arr,return_right_arr);
  }

  static int[] mergeArray(int[] arr,int[] return_left_arr,int[] return_right_arr){
    
    int nL = return_left_arr.length;
    int nR = return_right_arr.length;

    int i=0;
    int j=0;
    int k=0;

    // adding the smaller element from any of the two arrays and assigning them to the previous array
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

    //if some data is left in any of the array, then adding it
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

    // returning the correctly merged array
    return arr;
    
  }
}
