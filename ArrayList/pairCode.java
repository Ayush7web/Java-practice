import java.util.*;

public class pairCode {
  public static boolean pairSum2(ArrayList<Integer> list, int target) {
    int n = list.size();
    if (n < 2) {
      return false;
    }
    int bp = -1;
    for (int i = 0; i < n - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        bp = i;
        break;
      }
    }

    int lp, rp;
    if (bp == -1) {
      // Array is not rotated (already sorted) or all elements are equal
      lp = 0;
      rp = n - 1;
    } else {
      lp = bp + 1;
      rp = bp;
    }

    while (lp != rp) {
      // case 1
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }
      // case 2
      if (list.get(lp) + list.get(rp) < target) {
        lp = (lp + 1) % n;
      } else {
        // case 3
        rp = (n + rp - 1) % n;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    // 11,24,5,7,8,9 -- sorted and rotated
    list.add(11);
    list.add(24);
    list.add(5);
    list.add(7);
    list.add(8);
    list.add(9);
    // list.add(73);
    int target = 11;
    System.out.println(pairSum2(list, target));
  }
}
