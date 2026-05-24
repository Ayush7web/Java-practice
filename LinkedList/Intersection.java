
import java.util.*;
public class Intersection {
  public static void meetPoint(int num1[], int num2[]){
   for(int i=0; i <= num1.length-1; i++){
    for(int j = 0; j <= num2.length-1; j++){
      if (num1[i] == num2[j]) {
        int temp = num2[j];
        num2[j] = num1[i];
        num1[i] = temp;
        // System.out.println("threb");
        return;
      }
    }
   }
  }
  public static void main(String[] args) {
    int num1[] = {1,4,7,3};
    int num2[] = {2,5,9,3};
    meetPoint(num1, num2);
  }
}
