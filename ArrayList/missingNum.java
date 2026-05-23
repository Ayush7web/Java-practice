import java.util.*;

public class missingNum {

  public static int noMissing(int nums[]) {
    // int nums[] = {3,1,0};
    int n_xor = nums.length;
    for (int i = 0; i < nums.length; i++) {
      n_xor = n_xor ^ i;
      n_xor = n_xor ^ nums[i];
    }
    return n_xor;
  }

  public static void main(String[] args) {
    int nums[] = {3,2,0};
    System.out.println(noMissing(nums));
  }

}
