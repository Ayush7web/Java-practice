import java.util.*;
public class binaryString {

  public static void findDuplicate(int n , int lastPlace, String str){
// base case
if(n == 0){

  System.out.println(str);
  return;
}

// kaam
    if(lastPlace == 0){

      //sit 0 on chair n;
      findDuplicate(n-1, 0, str+"0");
      findDuplicate(n-1, 1, str+"1");
    }else{
      findDuplicate(n - 1, 0, str="0");
    }
  }
  public static void main(String[] args) {
    findDuplicate(3,0, "");
  }
}  