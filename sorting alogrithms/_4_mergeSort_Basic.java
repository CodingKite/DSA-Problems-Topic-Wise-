import java.util.Arrays;
public class _4_mergeSort_Basic{
  public static void main(String[] args){
    int[] arr = {10,4,1,33,0,54,22,6,7};
   
    int[] left_arr = {1,4,10,33};
    int[] right_arr = {0,6,7,22,54};
    mergeSort_Basic(arr,left_arr,right_arr);

    System.out.println(Arrays.toString(arr));
  }

  static void mergeSort_Basic(int[] arr,int[] left_arr,int[] right_arr){
    int nL = left_arr.length;
    int nR = right_arr.length;
    int i=0, j=0, k=0;

    //merging and soerting on the go && assigng the value in the original array
    while(i<nL && j<nR){
      if(left_arr[i] <= right_arr[j]){
        arr[k] = left_arr[i];
        i++;
      }else{
        arr[k] = right_arr[j];
        j++;
      }
      k++;
    }

    // if there ssomething left in any of the small array
    while(i<nL){
      arr[k] = left_arr[i];
      i++;
      k++;
    }

    while(j<nR){
      arr[k] = right_arr[j];
      j++;
      k++;
    }
    
  }

}