
package HashMap;

import java.util.*;

public class hashmap {

  static class HashMap<K, V> { // K for key and V for value is generic if type not fixed , then you create a
                               // generic value , which is going on.
    private class Node {
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<Node> buckets[]; // n

    @SuppressWarnings("unchecked")
    public HashMap(){
      this.size = 0;
      this.buckets = new LinkedList[4];
      for(int i=0; i<4; i++){
        this.buckets[i] = new LinkedList<>()
      }
    }

    private int hashFunction(K key){
      int hc = key.hashCode();
      return Math.abs(hc) % size;
    }

    

    public void put(K key, V value) {
      int bi = hashFunction(key);
      int di = SearchInLL(key); /// valid -1
    }

    public boolean containsKey(K key) {
      return false;
    }

    public V remove(K key) {
      return null;
    }

    public V get(K key) {
      return null;
    }

    public ArrayList<K> keySet() {
      return null;
    }

  }

  public static void main(String[] args) {

  }
}
