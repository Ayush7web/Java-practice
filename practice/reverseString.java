import java.util.*;

public class reverseString {
  // public static void main(String[] args) {
  // String str = "Kya Baat hai , ka haaal baa ho 7843hf6y4";
  // String revStr = "";

  // for (int i = str.length() - 1; i >= 0; i--) {
  // revStr += str.charAt(i);
  // }
  // System.out.println(revStr);
  // }
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();

    hm.put("India", 100);
    hm.put("switzerland", 80);
    hm.put("America", 200);
    hm.put("Nepal", 10);
    hm.put("China", 400);
    hm.put("Belgium", 900);
    hm.put("italy", 1200);

    // iteration part
    Set<String> keys = hm.keySet();
    // Set<Integer> values = hm
    System.out.println(keys);

    for (String k : keys) {
      System.out.println("keys will be = " + k +  ", values are = " + hm.get(k));
    }
  }

}
