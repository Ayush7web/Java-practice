
//  Dry run karna kal 
public class Palindrome {

  static class Node {
    int val;
    Node next;
    Node(int v) { val = v; }
  }

  static Node reverse(Node head) {
    Node prev = null;
    while (head != null) {
      Node next = head.next;
      head.next = prev;
      prev = head;
      head = next;
    }
    return prev;
  }

  static boolean isPalindrome(Node head) {
    if (head == null) return true;
    Node fast = head, slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    if (fast != null) { // odd length
      slow = slow.next;
    }

    slow = reverse(slow);
    fast = head;

    while (slow != null) {
      if (slow.val != fast.val) return false;
      fast = fast.next;
      slow = slow.next;
    }
    return true;
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(2);
    head.next.next.next.next = new Node(1);
    System.out.println(isPalindrome(head));
  }
}
