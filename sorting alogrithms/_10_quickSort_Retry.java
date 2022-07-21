import java.util.Arrays;

public class _10_quickSort_Retry{
  public static void main(String[] args){
    
    int[] arr = {7,2,1,6,8,5,3,4};
    quickSort(arr,0,arr.length-1);

  }

  static void quickSort(int[] arr,int start,int end){

    if(start < end){
       // partition
    int pv_idx = partition(arr,start,end);

    //recursive calls
    quickSort(arr,start,pv_idx-1);
    quickSort(arr,pv_idx+1,end);
    }
   
  }

  static int partition(int[] arr,int start,int end){
    int pv_value = arr[end];
    int pv_idx = start;
    System.out.println("partition ==> start "+start+ " end "+end+" pv_idx "+pv_idx+ " pv_value "+pv_value);

    for(int i = start; i <= end; i++){
      if(arr[i] < pv_value){
        int temp = arr[pv_idx];
        arr[pv_idx] = arr[i];
        arr[i] = temp;

        pv_idx++;
      }
    }

    //swap arr[pv_idx] with arr[end]
    int temp2 = arr[pv_idx];
    arr[pv_idx] = arr[end];
    arr[end] = temp2;

    System.out.println("NEW pv_idx "+pv_idx);
    System.out.println("Array => "+Arrays.toString(arr));

    return pv_idx;
    
  }
}