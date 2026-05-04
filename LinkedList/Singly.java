import java.util.*;

public class Singly {
  public static  class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data){
    // step 1 create a new Node
    Node newNode = new Node(data);
if(head == null){
  head = tail = newNode;
  return;
}
    // step 2 - newnode next = head;
    newNode.next = head; // link

    // step 3- head = newnode
    head = newNode;
  }
  public static void main(String[] args) {
    Singly  sl   =   new  Singly();
    // sl.head = new Node(1);
    // sl.head.next  =  new Node(2);
  // System.out.println(sl);  
  sl.addFirst(1);
  sl.addFirst(2);
  System.out.println();  
  }
  
    
}
