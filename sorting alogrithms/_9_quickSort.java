import java.util.Arrays;
public class _9_quickSort{
  public static void main(String[] args){
    int[] arr = {7,2,1,6,8,5,3,4};
    quickSort(arr,0,arr.length-1);
    System.out.println("final array "+Arrays.toString(arr));
  }

  
  static void quickSort(int[] arr,int start,int end){
   /*Base Case*/
  /*
    if(start >= end){
        return
    }
  */
    
    if(start < end){
    //partition
    System.out.println("start---> "+start+ " end --> "+end);
    int pv_idx = partition(arr,start,end);
    System.out.println("pivottt ==> "+ pv_idx);
    System.out.println("after partition "+Arrays.toString(arr));

    System.out.println("MODIFIED FIRST CALL start ==> "+start+" end ==> "+ (pv_idx-1));
    // System.out.println("MODIFIED SECON CALL start ==>  "+(pv_idx+1)+" end == "+ end);

    

    /*Recursive Call*/
      quickSort(arr,start,pv_idx-1);    //quickSort to left half
      quickSort(arr,pv_idx+1,end);     //quickSort to right half;
    }
  }

  static int partition(int[] arr,int start,int end){
    int pivot_val = arr[end];
    int pivot_idx = start;

    System.out.println("value of end received "+end);
    for(int i=0;i < end;i++){
    System.out.println("incresing i  "+i + " below "+end);

      if(arr[i] <= pivot_val){
        int temp = arr[i];
        arr[i] = arr[pivot_idx];
        arr[pivot_idx] = temp;
        pivot_idx++;
      }
    }
    // at the end swap arr[pivot_idx] with arr[end] to get pivot in the middle
    int temp = arr[end];
    arr[end] = arr[pivot_idx];
    arr[pivot_idx] = temp;
    
    return pivot_idx;
  }
  
}