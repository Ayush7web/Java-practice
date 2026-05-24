import java.util.*;

public class MergeSortTwo {

public static void mergeSortedArray(int[] num1, int[] num2, int m, int n){
  int i = m-1;
  int j = n-1;
  int x = m+n-1;

  while (i >= 0 && j >= 0) {
    if(num1[i] > num2[j]){
      num1[x] = num1[i];
      x--; i--;
    }else{
      num1[x] = num2[j];
      x--; j--;
    }
  }

  while( j >= 0){
    num1[x] = num2[j];
    j--; x--;
  }
}

public static void main(String[] args) {
  int m = 3;
  int n = 3;

   int num1[] = {1,2,3,0,0,0};
   int num2[] = {2,3,4};
   mergeSortedArray(num1, num2, m,n);
   for(int i = 0; i < 6; i++){
    System.out.println(num1[i] + " ");
   }
}

}