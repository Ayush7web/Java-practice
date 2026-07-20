package Leetcode;
class Solution {

  public static int addNumber(String non_zero) {
    int sum = 0;
    for (int i = 0; i < non_zero.length(); i++) {
      sum += non_zero.charAt(i) - '0';
    }
    return sum;
  }

  public static long mulNumber(String non_zero, int sum) {
    long number = 0;
    for (int i = 0; i < non_zero.length(); i++) {
      number = number * 10 + (non_zero.charAt(i) - '0');
    }
    return number * sum;
  }

  public static void main(String[] args) {
    String str = "102030000478";
    // int[][] queries = {{0,7},{1,3},{4,6}};
    int length = str.length();
    String zero = "";
    String non_zero = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '0') {
        zero += str.charAt(i);
      } else {
        non_zero += str.charAt(i);
      }

    }
    System.out.println("Zero digits : " + zero);
    System.out.println("Non-zero digits : " + non_zero);

    System.out.println(non_zero.getClass());
    int sum = addNumber(non_zero);
    System.out.println("Sum of all number : " + addNumber(non_zero));
    System.out.println("Multiple of all number : " + mulNumber(non_zero, sum));

  }
}