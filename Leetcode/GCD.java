package Leetcode;

class GCD {

  public static int GreatestDiv(int n) {
    int sumOne = 0;
    int sumOdd[] = { 1, 3, 5, 7 };
    int sumEven[] = { 2, 4, 6, 8 };
    for (int i = 0; i < sumOdd.length; i++) {
      sumOne = sumOdd[i];
    }
    System.out.println(sumOne);
    return 0;
  }

  public static void main(String args[]) {
    GreatestDiv(2);
  }
}
