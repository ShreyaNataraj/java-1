public class largestArray {
  public static int getlargest(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length; i++){
      if(largest<arr[i]){
        largest = arr[i];
      }
    }
    return largest;
    
  }


  
  public static void main(String args[]){
    int arr[] = {2,3,4,5,6,7,8,9,0};
    System.out.println("largset value is :" + getlargest(arr));
  }
}
