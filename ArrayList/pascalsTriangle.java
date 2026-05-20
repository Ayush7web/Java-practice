import java.util.*;

public class pascalsTriangle {

  public static void printPascal(int n, int[][] ans){
    // int i,j;
    for(int i=0; i<=n; i++){
      for(int j=0; j<i; j++){
        if (j == 0 || j == i) {
          ans[i][j] = 1;

          // System.out.println("print the term  " + j);

        }else{
          ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
        }
        System.out.println("the print " + ans[i][j]);
      }
     
    }
    
  }
  public static void main(String[] args) {
    int n = 4;
    int ans[][] = new int[n+1][n+1];
    // System.out.println(printPascal(3));
    printPascal(4, ans);
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
