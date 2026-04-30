import java.util.*;

public class Singly {
  public static  class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
    public Node1(int data ){
      this.data = data;
      this.next = null;
      return;
    }
    
  }

  public static Node head;
  public static Node tail;
  public static void main(String[] args) {
    Singly  sl   =   new  Singly();
    sl.head = new Node(1);
    sl.head.next  =  new Node(2);
  System.out.println(sl);  
  }
    
}
