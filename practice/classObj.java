
public class classObj {

  static class Book {
    String title;
    String author;
    Double price;
    int stock;

    Book(String title, String author, Double price, int stock) {
      this.title = title;
      this.author = author;
      this.price = price;
      this.stock = stock;
    }

    void displayDetails() {
      System.out.println("Title of this book :" + title);
      System.out.println("Author of this book :" + author);
      System.out.println("Price of this book :" + price);
      System.out.println("Stock of this book :" + stock);

    }
    void purchaseBooks(int quantity){
      if(quantity >= stock){
        System.out.println("Out of stock");
      }else{
       System.out.println("Total bill :" + (price * quantity));
        stock =  stock - quantity;
      }
    }
  }

  public static void main(String[] args) {
    Book b1 = new Book("java", "ayush", 10.00, 87);
    b1.displayDetails();
    b1.purchaseBooks(85);
  }
}
