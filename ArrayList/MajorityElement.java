// Given an array ‘nums’ of size n, return the majority element.

//As we have already discussed above, the majority element is the element that appears more than [n / 2] times. If no such element exists, then return -1.

import java.util.*;

public class MajorityElement {

  // base case
  

  public static int MooresAlgo(int nums[]){
    // int halfNum = nums/2;
    int counter = 0;
    int n = nums.length / 2;
    for(int i = 0; i <= n; i++){
      if(nums[i] == nums[i+1]){
        counter++;
      }else{
        counter--;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums [] = {2,2,1,1,1,2,2};
    System.out.println(MooresAlgo(nums));
  }
}
