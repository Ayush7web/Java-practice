import java.util.*;

public class SortedRotate {
public static int search(int arr[] , int tar, int si, int ei){

  // base case 
  if(si > ei){
    return -1;
  }

  // kaam 
  int mid = (si+ei)/2;
  if(arr[mid] == tar){
    return mid;
  }

  // mid on L1
  if(arr[si] <= arr[mid]){
    // case a: left
    if(arr[si] <= tar && tar <= arr[mid]){
      return search(arr, tar, si, mid);
    }else{
      // case b : right
      return search(arr, tar, mid + 1, ei);
    }

  }

  /// mid on L2
  else{
    // case c : right
    if(arr[mid] <= tar && tar <= arr[ei]){
      return search(arr, tar, mid + 1, ei);
    }else{
      // case d : left 
      return search(arr, tar, si, mid - 1);
    }
  }


}

  public static void main(String[] args) {
    int arr[] = { 2,5,7,2,0,7,9,1,6};
    int target = 0;  // target of index 6 ke equal.
    int tarIdx = search(arr, target, 0, arr.length-1);
    System.out.println(tarIdx);
  }
}
