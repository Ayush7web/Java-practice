import java.util.*;

import Singly.Node;

public class MergeSort {

  private Node getMid(Node head){
    Node slow =  head;
    Node fast = head.next;

    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // mid node 
  }

  private Node merge(Node head1, Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (head != null && head2 != null) {
      if(head1.data <= head2 data){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      }
    }
  }

  public Node mergeSort(Node head){
    if(head == null && head.next != null){
      return head;
    }


// find mid

Node mid = getMid();
// left & right merge sorted
Node rightHead = mid.next;
mid.next = null;
Node newLeft = mergeSort(head);
Node newRight = mergeSort(rightHead);


// merge

return merge(newLeft , newRight);
  }
  public static void main(String[] args) {
    
  }
}
