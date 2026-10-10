public class Product {
private String name;
private double price;
private int quantity;

//No Argument Constructor
  public Product(){
    name = "shoelace";
    price = 8.99;
    quantity = 20;
  }

  //Parameterized Constructor
  public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  //Accessory methods
  public String getName(){
    return name;
  }
  public double getPrice(){
    return price;
  }
  public int getQuantity(){
    return quantity;
  }

  //Mutator Methods
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  //toString Method
  public String toString(){
    return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
  }
}