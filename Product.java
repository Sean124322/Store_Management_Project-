public class Product {
private String name;
private double price;
private int quantity;

    /*
    * Initializes a product with default values for its name, price, and quantity.
    */
    public Product(){
    name = "shoelace";
    price = 8.99;
    quantity = 20;
  }

    /*
    * Initializes a product using the name, price, and quantity provided.
    */
    public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
     /*
     * Returns the name of the product.
     */
  public String getName(){
    return name;
  }
     /*
     * Returns the price of the product.
     */

  public double getPrice(){
    return price;
  }
     /*
     * Returns the quantity of the product in stock.
     */
  public int getQuantity(){
    return quantity;
  }

     /*
     * Changes the name of the product.
     */
  public void setName(String name){
    this.name = name;
  }
     /*
     * Changes the price of the product.
     */
  public void setPrice(double price){
    this.price = price;
  }
    /*
     * Changes the quantity of the product in stock.
     */
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
    /*
     * Returns the product's information as a formatted String.
     */
  public String toString(){
// Use accessor methods to retrieve the product information.

    return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
  }
}