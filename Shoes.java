public class Shoes extends Product{
  private double shoeSize;
  private String color;

//no Argument Constructor
  public Shoes(){
    super("New Balance", 120.00, 5);
    shoeSize = 12;
    color = "white";
  }

  //Parameterized constructor
  public Shoes(String name, double price, int quantity, double shoeSize, String color){
    super(name, price, quantity);
    this.shoeSize = shoeSize;
    this.color = color;
  }

  //Accessory Methods
  public double getShoeSize(){
    return shoeSize;
  }
  public String getColor(){
    return color;
  }

  //Mutator Methods
  public void setShoeSize(double ShoeSize){
    this.shoeSize = shoeSize;
  }
  public void setColor(String color){
    this.color = color;
  }

  //toString Method
  public String toString(){
    return super.toString() + "\nShoe Size: " + getShoeSize() + "\nColor: " + getColor();
  }
}