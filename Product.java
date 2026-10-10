public class Product {
private String name;
private double price;
private int quantity;

  public Product(){
    name = "shoelace";
    price = 8.99;
    quantity = 20;
  }
  public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public String toString(){
    return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
  }
}