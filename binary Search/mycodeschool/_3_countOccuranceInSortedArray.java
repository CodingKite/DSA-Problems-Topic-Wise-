import java.util.Scanner;


public class _3_countOccuranceInSortedArray{

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int[] arr = arrayCreation(scn);

    //Which element to count in the sorted array
    System.out.printf("Enter an number to Count in the Sorted array \n");
    int num = scn.nextInt();
    scn.close();

    // Linear Search
    // int count = linearSearch(arr,num);

    // Binary Search(iterative, recursive) -- find index then go its left and right to count.
    // int count = findCountUsingBinaryIterativeMethodOne(arr,num);

    // Binary Search(iterative, recursive) -- find firstIndex, if firstIndex!=-1 then the lastIndex and then count = last-first+1 .
    int count = findCountUsingBinaryIterativeMethodTwo(arr,num);
    

    if(count==0){
      System.out.printf("Number %d does not exist in the array: Count %d \n",num,count);
    }else{
      System.out.printf("Count of %d in the array is %d\n",num,count);
    }

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



  //Time Complexity: BigO(n)
  static int linearSearch(int[] arr, int num){

    int count = 0;

    for(int i=0; i < arr.length-1; i++){
      if(arr[i] <= num){
        if(arr[i]==num){
          count++;
        }
      }else{
        //since it is as sorted array, if we get number greater then the one we want to search, there is no point searching further as all the processding element will greater since this is an sorted array.
        break;
      }
    }

    return count;
  }



  // Time Complexity is BigO(logn with base 2) + BigO(n)  ~~ BigO(n)
  static int findCountUsingBinaryIterativeMethodOne(int[] arr,int num){
    int count = 0;  

    //Time Complexity is BigO(logn with base 2)
      int index = findIndexBinaryIterative(arr,num);
      // int index = fintIndexBinaryRecursive(arr,0,arr.length-1,num);
    
    if(index!= -1){

      //Time Complexity is BigO(n)
      count = countForwardBackward(arr,num,index);

    }

    return count;
      
  }

  static int findIndexBinaryIterative(int[] arr,int num){
    int low = 0;
    int high = arr.length-1;
    int mid;

    while(low <= high){
      mid = low + ((high-low)/2);

      if(num == arr[mid]){
        return mid;
      }else if(num < arr[mid]){
        high = mid - 1;
      }else{
        low = mid + 1;
      }

    }

    return -1;

  }

  static int fintIndexBinaryRecursive(int[] arr,int low,int high,int num){

    if(low > high){
      return -1;
    }

    int mid = low + ((high-low)/2);
    if(num == arr[mid]){
      return mid;
    }else if(num < arr[mid]){
      return fintIndexBinaryRecursive(arr,low,mid-1,num);
    }else{
      return fintIndexBinaryRecursive(arr,mid+1,high,num);
    }

  }

  static int countForwardBackward(int[] arr,int num,int index){
      
    //count in forward direction
    int forward = index, backward = index;
    int count = 0;

    while((forward <= arr.length-1) && (arr[forward] == arr[index])){
      count++;
      forward++;
    }

    while((backward > 0) && (arr[backward] == arr[index])){
      count++;
      backward--;
    }

    //index was counted twice, so reducing the count by 1
    count--;

    return count;
  }



  static int findCountUsingBinaryIterativeMethodTwo(int[] arr,int num){

    int firstIndex;  
    int lastIndex;
    int count=0;

    //first and last index using Iterative
      // firstIndex = firstIndexIterative(arr,num);
      // if(firstIndex != -1){
      //   lastIndex = lastIndexIterative(arr,num);
      //   count = lastIndex - firstIndex + 1;
      // }

    //first and last index using Recursive
        firstIndex = firstIndexRecursive(arr,num,0,arr.length-1,-1);
        if(firstIndex != -1){
          lastIndex = lastIndexRecursive(arr,num,0,arr.length-1,-1);
          count = lastIndex - firstIndex + 1;
        }

    return count;

  }

  static int firstIndexIterative(int[] arr,int num){
    int low = 0;
    int high = arr.length-1;
    int index = -1;
    int mid;

    while(low <= high){
      mid = low + ((high-low)/2);

      if(num == arr[mid]){
        index = mid;
        high = mid - 1;
      }else if(num < arr[mid]){
        high = mid - 1;
      }else{
        low = mid + 1;
      }

    }

    return index;
  }

  static int lastIndexIterative(int[] arr,int num){
    int low = 0;
    int high = arr.length-1;
    int mid;
    int index = -1;

    while(low <= high){

      mid = low + ((high-low)/2);

      if(num == arr[mid]){
        index = mid;
        low = mid + 1;
      }else if(num < arr[mid]){
        high = mid - 1;
      }else{
        low = mid + 1;
      }

    }

    return index;
  }

  static int firstIndexRecursive(int[] arr,int num,int low,int high,int index){

    if(low > high){
      return index;
    }
    
    int mid = low + (high-low)/2;

    if(num == arr[mid]){
      return firstIndexRecursive(arr, num,low, mid-1, mid);
    }else if(num < arr[mid]){
      return firstIndexRecursive(arr, num, low, mid-1, index);
    }else{
      return firstIndexRecursive(arr, num, mid+1, high, index);
    }
  
  }

  static int lastIndexRecursive(int[] arr,int num,int low,int high,int index){
    
    if(low > high){
      return index;
    }

    int mid = low + (high-low)/2;
    
    if(num == arr[mid]){
      return lastIndexRecursive(arr, num, mid+1, high,mid);
    }else if(num < arr[mid]){
      return lastIndexRecursive(arr, num, low, mid-1, index);
    }else{
      return lastIndexRecursive(arr, num, mid+1, high, index);
    }
  }

}

