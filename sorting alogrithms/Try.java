import java.util.Arrays;

public class Try {
  
  public static void main(String[] args) {
    int[] arr = {10,4,1,33,0,54,22,6,7};

    // selectionSort(arr);
    bubbleSort(arr);

    System.out.println(Arrays.toString(arr));
  }


  static void bubbleSort(int[] arr){
    //number of pass
    for(int i=0; i <= arr.length-2; i++){
      System.out.println("=============================");
      int flag=0;
      for(int j = 0 ; j <= arr.length-2-i; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
          flag=1;
        }
        System.out.println(Arrays.toString(arr));
        if(flag==1){
          System.out.println("breaking");
          break;
        }
      }

    }
  }


  static void selectionSort(int[] arr){
    for(int i = 0; i <= arr.length-2; i ++){
      
      System.out.println("=============================");
      
      int min_idx = i;


      for(int j = i+1; j<=arr.length-1; j++){

        if(arr[j]< arr[min_idx]){
          min_idx = j;
        }

      }


      //after findin the min element swap it
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
      System.out.println(Arrays.toString(arr));

    }
  }

}
