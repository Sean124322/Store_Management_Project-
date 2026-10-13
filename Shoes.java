public class Shoes extends Product{
  private double shoeSize;
  private String color;

    /*
     * Initializes a sneaker with default product information, shoe size, and color.
     */
  public Shoes(){
    super("New Balance", 120.00, 5);
    shoeSize = 12;
    color = "white";
  }

    /*
     * Initializes a sneaker using its name, price, quantity, and shoe size,
     * while assigning a default color.
     */
  public Sneaker(String name, double price, int quantity, int shoeSize){
  super(name, price, quantity);
  this.shoeSize = shoeSize;
  this.color = "Black";
  }

    /*
     * Initializes a sneaker using the provided product information, shoe size, and color.
     */
  public Shoes(String name, double price, int quantity, double shoeSize, String color){
    // Initialize the shared product information through the superclass.
    super(name, price, quantity);
    // Initialize the sneaker-specific instance variables.
    this.shoeSize = shoeSize;
    this.color = color;
  }

    /*
     * Returns the shoe size.
     */
  public double getShoeSize(){
    return shoeSize;
  }
    /*
     * Returns the sneaker's color.
     */

  public String getColor(){
    return color;
  }

    /*
     * Changes the shoe size.
     */
  public void setShoeSize(double ShoeSize){
    this.shoeSize = shoeSize;
  }
    /*
     * Changes the sneaker's color.
     */
  public void setColor(String color){
    this.color = color;
  }

    /*
     * Returns the product information along with the sneaker's size and color.
     */
  public String toString(){
    // Reuse the superclass's toString method and add sneaker-specific details.
    return super.toString() + "\nShoe Size: " + getShoeSize() + "\nColor: " + getColor();
  }
}