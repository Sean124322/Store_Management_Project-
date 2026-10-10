public class Accessory extends Product{
  private String type;
  private String brand;

  public Accessory(){
    super("Tennis bracelet", 500.00, 1);
    type = "bracelet";
    brand = "Cartier";
  }
  public Accessory(String name, double price, int quantity, String type, String brand){
   super(name, price, quantity);
    this.type = type;
    this.brand = brand;
  }
  public String getType(){
    return type;
  }
  public String getBrand(){
  return brand;
  }
  public void setType(String type){
    this.type = type;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public String toString(){
  return super.toString() + "\nType: " + getType() + "\nBrand: " + getBrand();
  }
}