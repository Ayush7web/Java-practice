package ApnaCollege;

// public class FindOccur {
// public static int findIndex(int arr[], int key, int i) {
// if (i == arr.length) {
// return -1;
// }

// if (arr[i] == key) {
// return i;
// }

// return findIndex(arr, key, i+1);
// }

//   public static int lastIndex(int arr[], int key, int i) {
//     if(i == arr.length){
//       return -1;
//     }
//     int isFound = lastIndex(arr, key, i + 1);
//     if (isFound == -1 && arr[i] == key) {
//       return i;
//     }
//     return isFound;

//   }

//   public static void main(String args[]) {
//     int arr[] = { 3, 4, 32, 3, 5, 5, 5, 32, 32212, 2, 54 };
// System.out.println(lastIndex(arr, 32, 0));
//   }
// }

// public class findPower{
//   public static  int powerFunc(int x, int n){
//     if(n == 0){
//       return 1;
//     }
//     return x * powerFunc(x , n -1 );
//   }

//   public static void main(String[] args) {
//     System.out.println(powerFunc(32, 5));
//   }
// }

// class Solution {
//   public int smallestIndex(int[] nums) {
//     for (int i = 0; i < nums.length; i++) {
//       if (sumOfDigits(nums[i]) == i) {
//         return i; // Kyunki hum 0 se iterate kar rahe hain, sabse pehla match hi smallest index
//                   // hoga
//       }
//     }
//     return -1; // Agar koi index match na kare
//   }

//   private int sumOfDigits(int n) {
//     int sum = 0;
//     n = Math.abs(n); // Negative numbers handle karne ke liye (agar input me ho)
//     while (n > 0) {
//       sum += n % 10;
//       n /= 10;
//     }
//     return sum;
//   }
// }

import java.util.*;

public class Solution {
  private int index = 0;

  public List<String> braceExpansionII(String expression) {
    this.index = 0;
    Set<String> resultSet = parseUnion(expression);

    // Final result must be sorted and unique
    List<String> resultList = new ArrayList<>(resultSet);
    Collections.sort(resultList);
    return resultList;
  }

  // Handles union: expr1, expr2, ...
  private Set<String> parseUnion(String s) {
    Set<String> totalSet = new TreeSet<>();

    while (index < s.length() && s.charAt(index) != '}') {
      Set<String> concatSet = parseConcat(s);
      totalSet.addAll(concatSet);

      // If a comma is encountered, skip it and continue the union
      if (index < s.length() && s.charAt(index) == ',') {
        index++;
      }
    }
    return totalSet;
  }

  // Handles concatenation / Cartesian product: factor1 + factor2 + ...
  private Set<String> parseConcat(String s) {
    Set<String> currentProduct = new TreeSet<>();
    currentProduct.add(""); // Neutral element for concatenation

    // Keep concatenating factors until reaching a comma, closing brace, or end of
    // string
    while (index < s.length() && s.charAt(index) != ',' && s.charAt(index) != '}') {
      Set<String> factor = parseFactor(s);
      currentProduct = cartesianProduct(currentProduct, factor);
    }
    return currentProduct;
  }

  // Handles a single unit: either a lowercase letter or a braced group {...}
  private Set<String> parseFactor(String s) {
    Set<String> factor = new TreeSet<>();

    if (s.charAt(index) == '{') {
      index++; // consume '{'
      factor = parseUnion(s);
      index++; // consume '}'
    } else {
      // Lowercase letter
      StringBuilder sb = new StringBuilder();
      while (index < s.length() && Character.isLowerCase(s.charAt(index))) {
        sb.append(s.charAt(index));
        index++;
      }
      factor.add(sb.toString());
    }

    return factor;
  }

  // Cartesian product of two sets of strings
  private Set<String> cartesianProduct(Set<String> setA, Set<String> setB) {
    Set<String> result = new TreeSet<>();
    for (String a : setA) {
      for (String b : setB) {
        result.add(a + b);
      }
    }
    return result;
  }
}
