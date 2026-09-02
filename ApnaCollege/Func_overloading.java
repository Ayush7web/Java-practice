package ApnaCollege;

public class Func_overloading {
  public static int twoNoMult(int a , int b){
     int result = a * b;
    System.out.println("Multiply two numbers");
    return result;
  }

  public static int twoNoMult(int a , int b , int c){
    int result = a * b* c;
    System.out.println("Multiply two numbers");
    return result;
  }

  public static float twoSum(float a , float b){
    float result = a + b;
    System.out.println("Adding two numbers");
    return result;
  }
  public static void main(String[] args) {
    System.out.println(twoNoMult(3, 5, 6));
    System.out.println(twoNoMult(3, 5));
    System.out.println(twoSum(4, 8));
  }
}
