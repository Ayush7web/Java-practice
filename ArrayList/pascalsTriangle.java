import java.util.*;

public class pascalsTriangle {

  public static void printPascal(int n){
    // int i,j;
    for(int i=0; i<=n; i++){
      for(int j=0; j<i; j++){
        if (j == i) {
          j++;
        }
        System.out.println(i);
      }
      // System.out.println("the pascalsTriangle + " );
    }
    
  }
  public static void main(String[] args) {
    int ans[] = new int[6];
    // System.out.println(printPascal(3));
    printPascal(6);
  }
}








//                   1
//                 1 2 1
//                1 2 3 1
//
//
//
//
//
//
//
//
//
