public class Accessory extends Product{
  private String type;
  private String brand;

    /*
     * Initializes an accessory with default product information, type, and brand.
     */  public Accessory(){
    super("Tennis bracelet", 500.00, 1);
    type = "bracelet";
    brand = "Cartier";
  }

    /*
     * Initializes an accessory using the provided product information, type, and brand.
     */
    public Accessory(String name, double price, int quantity,
                     String type, String brand)
    {
        // Initialize the shared product information through the superclass.
        super(name, price, quantity);

        // Initialize the accessory-specific instance variables.
        this.type = type;
        this.brand = brand;
    }


    /*
     * Returns the type of accessory.
     */
    public String getType(){
    return type;
  }
    /*
     * Returns the brand of the accessory.
     */
  public String getBrand(){
  return brand;
  }

    /*
     * Changes the type of accessory.
     */
    public void setType(String type){
    this.type = type;
  }
    /*
     * Changes the brand of the accessory.
     */
  public void setBrand(String brand){
    this.brand = brand;
  }

    /*
     * Returns the product information along with the accessory's type and brand.
     */
  public String toString(){
    // Reuse the superclass's toString method and add accessory-specific details.

  return super.toString() + "\nType: " + getType() + "\nBrand: " + getBrand();
  }
}