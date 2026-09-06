package ApnaCollege;

public class CopyContruct {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "ayush";
    s1.roll = 8;
    s1.password = "mockprepare";

    Student s2 = new Student(s1);
    s2.password = "mockpreparepro";

    System.out.println("New password dekhlo :" + s2.password);
  }
}

class Student {
  String name;
  int roll;
  String password;

  Student(Student s1) {
    this.name = s1.name;
    this.roll = s1.roll;
    this.password = s1.password;
    System.out.println("print kar " + name);
    System.out.println("dekhlo password : " + password);
  }

  

  Student() {
    System.out.println("the contructor called");
  }

  Student(String name) {
    this.name = name;
  }

  Student(int roll) {
    this.roll = roll;
  }
}