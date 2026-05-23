import java.util.*;

public class missingNum {

  public static int noMissing(int nums[]) {
    int n_xor = nums.length;
    for (int i = 0; i < nums.length; i++) {
      n_xor = n_xor ^ i;
      n_xor = n_xor ^ nums[i];
    }
    return n_xor;
  }

  public static void main(String[] args) {
    int nums[] = new int[3];
    System.out.println(noMissing(nums));
  }

}
