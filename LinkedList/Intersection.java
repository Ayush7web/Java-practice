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
      System.out.println(-1);
      return;
    }

    Node p1 = num1;
    Node p2 = num2;

    while (p1 != p2) {

      if (p1 == null) {
        p1 = num2;
      } else {
        p1 = p1.next;
      }

      if (p2 == null) {
        p2 = num1;
      } else {
        p2 = p2.next;
      }
    }

    if (p1 == null) {
      System.out.println(-1);
    } else {
      System.out.println(p1.data);
    }
  }

  public static void main(String[] args) {

    // common node
    Node common = new Node(87);

    Node num1 = new Node(1);
    num1.next = new Node(2);
    num1.next.next = new Node(7);
    num1.next.next.next = common;

    Node num2 = new Node(2);
    num2.next = new Node(5);
    num2.next.next = new Node(9);
    num2.next.next.next = common;

    meetPoint(num1, num2);
  }
} 