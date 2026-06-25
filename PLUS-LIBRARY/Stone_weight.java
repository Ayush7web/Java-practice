import java.util.*;

public class Stone_weight {

  // Common "Stone Weight" problem:
  // Given N stones with weights, split them into two groups (left/right) such
  // that
  // |sumLeft - sumRight| is minimum.
  // Returns the minimum possible difference.
  static int minStoneDifference(int[] stones) {
    int total = 0;
    for (int w : stones)
      total += w;

    // target: find subset sum closest to total/2
    int target = total / 2;
    boolean[] dp = new boolean[target + 1];
    dp[0] = true;

    for (int w : stones) {
      for (int s = target; s >= w; s--) {
        if (dp[s - w])
          dp[s] = true;
      }
    }

    for (int s = target; s >= 0; s--) {
      if (dp[s]) {
        return total - 2 * s;
      }
    }
    return total; // fallback (should not happen)
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input format (if you want to test locally):
    // n
    // w1 w2 ... wn
    // Example:
    // 5
    // 1 2 3 4 5
    if (!sc.hasNextInt())
      return;
    int n = sc.nextInt();
    int[] stones = new int[n];
    for (int i = 0; i < n; i++)
      stones[i] = sc.nextInt();

    int ans = minStoneDifference(stones);
    System.out.print(ans);
  }
}
