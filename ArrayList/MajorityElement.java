// Given an array ‘nums’ of size n, return the majority element.

//As we have already discussed above, the majority element is the element that appears more than [n / 2] times. If no such element exists, then return -1.

public class MajorityElement {

  // Returns the majority element if it exists (> n/2 occurrences), else -1.
  public static int MooresAlgo(int[] nums) {
    int candidate = 0;
    int count = 0;

    // 1) Find a candidate using Moore's Voting Algorithm
    for (int num : nums) {
      if (count == 0) {
        candidate = num;
        count = 1;
      } else if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }

    // 2) Verify the candidate
    int freq = 0;
    for (int num : nums) {
      if (num == candidate)
        freq++;
    }

    return (freq > nums.length / 2) ? candidate : -1;
  }

  public static void main(String[] args) {
    int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
    System.out.println(MooresAlgo(nums));
  }
}
