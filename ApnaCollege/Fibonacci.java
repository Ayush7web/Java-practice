// find fibonacci number in recursive form

package ApnaCollege;

public class Fibonacci {

  // calculate nth term in fibonacci
  public static int fib(int n) {

    if (n == 0 || n == 1) {
      return n;
    }

    int fnm1 = fib(n - 1);
    int fnm2 = fib(n - 2);
    int fn = fnm1 + fnm2;
    return fn;
  }

  public static boolean isSorted(int arr[], int i) {
    if (i == arr.length - 1) {
      return true;
    }

    if (arr[i] > arr[i + 1]) {
      return false;
    }

    return isSorted(arr, i + 1);
  }

  public static void main(String[] args) {
    // int n = 26;
    // System.out.println(fib(21));
    // System.out.println(fib(22));
    // System.out.println(fib(23));
    // System.out.println(fib(24));
    // System.out.println(fib(25));
    // System.out.println(fib(26));

    int arr[] = {23,4,3,5,6,43,65,21};
    // int arr[] = { 1, 2, 3, 4, 5 };
    System.out.println(isSorted(arr, 0));

  }
}

// i have to solve exactly questions in Dynamic programming