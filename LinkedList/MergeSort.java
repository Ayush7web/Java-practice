import java.util.*;

public class MergeSort {

  class Node {
    int data;
    Node next;
  }

  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // mid node
  }

  private Node merge(Node head1, Node head2) {
    Node mergedLL = new Node();
    Node temp = mergedLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }
    return mergedLL.next;
  }

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    // find mid

    Node mid = getMid(head);
    // left & right merge sorted
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    // merge

    return merge(newLeft, newRight);
  }

  public Node addFirst(Node head, int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = head;
    return newNode;
  }

  public void printList(Node head) {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    MergeSort list = new MergeSort();
    Node head = null;
    head = list.addFirst(head, 1);

    head = list.addFirst(head, 4);
    head = list.addFirst(head, 5);
    head = list.addFirst(head, 7);
    head = list.addFirst(head, 8);
     head = list.addFirst(head, 32);
    head = list.addFirst(head, 54);

    list.printList(head);

    head = list.mergeSort(head);
    list.printList(head);
  }
}
