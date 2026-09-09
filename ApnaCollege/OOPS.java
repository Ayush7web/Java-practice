package ApnaCollege;

// public class Func_overloading {
//   public static int twoNoMult(int a , int b){
//      int result = a * b;
//     System.out.println("Multiply two numbers");
//     return result;
//   }

//   public static int twoNoMult(int a , int b , int c){
//     int result = a * b* c;
//     System.out.println("Multiply two numbers");
//     return result;
//   }

//   public static float twoSum(float a , float b){
//     float result = a + b;
//     System.out.println("Adding two numbers");
//     return result;
//   }
//   public static void main(String[] args) {
//     System.out.println(twoNoMult(3, 5, 6));
//     System.out.println(twoNoMult(3, 5));
//     System.out.println(twoSum(4, 8));
//   }
// }

// q no 2 
// class Person{
//   String name;
//   int weight;
// }

// class Student extends Person{
//   int rollNumber;
//   String schoolName;
// }

// Important points
// private and protected identifier are not allowed in front of class. samjhe mere bache.
// Nested class, Constructor, methods and field are are allowed access in private and protected.

// child ka jo object hai usko parent ke reference mein assign kar sakte hai , This is always true in java.. samjhe bachuu

// Vehicle v = new car();
//  // reference point    //object creation

// public class inheritance {
//   public static void main(String[] args) {
//     Vehicle obj1 = new Car();
//     obj1.print();

//     Vehicle obj2 = new Vehicle();
//     obj2.print();
//   }
// }

// class Vehicle {
//   void print() {
//     System.out.println("Base class Vehicle");
//   }
// }

// class Car extends Vehicle {
//   void print() {
//     System.out.println("Derive class Car");
//   }
// }

// class Book{
//   int price;
//   static int count;

//   public Book(int price){
//     this.price = price;
//     count++;
//   }
// }

// public class OOPS{
//   public static void main(String[] args) {
//     System.out.println(Book.count);
//     Book b1 = new Book(150);
//     Book b2 = new Book(250);
//     Book b3 = new Book(250);
//     System.out.println(Book.count);
//   }
// }

// class Test {
//   static int marks;

//   void set_marks(int marks) {
//     this.marks = marks;
//   }
// }

// class OOPS {
//   public static void main(String[] args) {
//     Test t = new Test();
//     t.set_marks(98);
//     System.out.println(Test.marks);
//   }
// }


class Test{
  static int a = 10;
  static int b;
  static void changeB(){
    b = a * 3;
  }
}

class OOPS{
  public static void main(String[] args) {
    Test t = new Test();
    t.changeB();
    System.out.println(Test.a + Test.b);
  }
}