import java.util.Arrays;

public class _3_insertionSort{
  public static void main(String[] args) {
    int[] arr = {10,4,1,33,0,54,22,6,7};

    selectionSort(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void selectionSort(int[] arr){
    
    for(int i = 0 ; i <= arr.length-1; i++){
      int value = arr[i];
      int hole = i;

      while(hole > 0 && arr[hole-1]>value){
        arr[hole] = arr[hole-1];
        hole--;
      }

      arr[hole] = value;  
      
      // System.out.println(Arrays.toString(arr));

    }
  }

}