public class Accessory extends Product{
  private String type;
  private String brand;

//no Argument constructor
  public Accessory(){
    super("Tennis bracelet", 500.00, 1);
    type = "bracelet";
    brand = "Cartier";
  }

  //Parameterized Constructor
  public Accessory(String name, double price, int quantity, String type, String brand){
   super(name, price, quantity);
    this.type = type;
    this.brand = brand;
  }

  //Accessor Methods
  public String getType(){
    return type;
  }
  public String getBrand(){
  return brand;
  }

  //Mutator Methods
  public void setType(String type){
    this.type = type;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }

  //toString Method
  public String toString(){
  return super.toString() + "\nType: " + getType() + "\nBrand: " + getBrand();
  }
}