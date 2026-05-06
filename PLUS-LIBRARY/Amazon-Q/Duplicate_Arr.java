// Removes Duplicate from sorted array

import java.util.*;
public class Duplicate_Arr {

  public static void main(String[] args) {
    int nums[] = {0, 1, 1, 2, 2, 0, 3, 3};
    System.out.println(mergeSorted(nums));
  }

  public static int mergeSorted(int[] nums){
    int i = 0;
   for( int j = 1; j < nums.length; j++){
    if(nums[i] < nums[j]){
      int temp = nums[i+1];
      nums[i+1] = nums[j];
      nums[j] = temp;
      i++;
    }
   }
   return i+1;
  }
}