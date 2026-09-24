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


class Solution {
  public int smallestIndex(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (sumOfDigits(nums[i]) == i) {
        return i; // Kyunki hum 0 se iterate kar rahe hain, sabse pehla match hi smallest index
                  // hoga
      }
    }
    return -1; // Agar koi index match na kare
  }

  private int sumOfDigits(int n) {
    int sum = 0;
    n = Math.abs(n); // Negative numbers handle karne ke liye (agar input me ho)
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}













