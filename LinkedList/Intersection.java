
import java.util.*;

public class Intersection {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  public static void meetPoint(Node num1, Node num2) {

    if (num1 == null || num2 == null) {
      return;
    }

    Node p1 = num1, p2 = num2;

    while (num1 != num2) {
      if (num1 == null) {
        num1 = p2;
      } else if (num2 == null) {
        num2 = p1;
      } else {
        num1 = num1.next;
        num2 = num2.next;
      }
    }
    System.out.println(num1.data);
  }

  public static void main(String[] args) {
    Node newNode = new Node(1);

    Node num1 = new Node(1);
    num1.next = new Node(4);
    num1.next.next = new Node(7);
    num1.next.next.next = new Node(3);

    Node num2 = new Node(2);
    num2.next = new Node(5);
    num2.next.next = new Node(9);
    num2.next.next.next = new Node(3);
meetPoint(num1, num2);
  }
}
