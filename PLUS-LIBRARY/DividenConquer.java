import java.util.*;

public class DividenConquer {

  public static void printArr(int arr[]) {
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  // main logic define
  public static void mergeSort(int arr[], int si,  int ei) {
    // base case
    if (si >= ei) {
      return;
    }

    // logic
    int mid = (si + ei)/2;
    mergeSort(arr, si, mid); // left part
    mergeSort(arr, mid + 1, ei); // right part
    merge(arr, si, mid, ei); // suppose kiya gaya hai phir use declare kiya gaya hai
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si; // iterator for left part
    int j = mid + 1; // iterator for right part
    int k = 0; // iterator for temp arr

    while(i <= mid && j <= ei){
    if(arr[i] < arr[j]){
    temp[k] = arr[i];
    i++;
    }else{
    temp[k] = arr[j];
    j++;
    }
    k++;
    }

    // left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    // right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }

    // copy temp to original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }

  }

  public static void main(String[] args) {
    int arr[] = { 4, 6, 3, 7, 9, 2, 8, 7, 5 };
    mergeSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
