// removes duplicate in a string ; samjhe bachuu

import java.util.*;
public class Recursion {
  
  public static void initiateTerm(StringBuilder sb, String str, int index, boolean map[]){
    // StringBuilder st = new StringBuilder();
    if(index == str.length()){
      System.out.println(sb);
      return;
    }
    

    // kaam 

    char currChar = str.charAt(index);
    if(map[currChar-'a'] == true){
      // duplicate
      initiateTerm(sb, str, index+1, map);  
    }else{ 
      map[currChar -'a'] = true;
      initiateTerm(sb.append(currChar), str, index+1, map);
    }
  }
  
  public static void main(String[] args) {
    String str = "ayushh";
    initiateTerm(new StringBuilder(""), str, 0, new boolean[26]);
  }
}
