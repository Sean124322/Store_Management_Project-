public class StoreRunner {
  public static void main(String[] args) {

//Instantiates the objects
Shoes s = new Shoes("Jordan 4's", 210.00, 20, 13.0, "Red and Black");
Shoes r = new Shoes();
Product t = new Product("shirt", 40.00, 30);
Product m = new Product();
Accessory a = new Accessory();
Accessory b = new Accessory("Baseball hat", 25.00, 20, "Hat", "Nike");

//Pritns the data
System.out.println(s);
System.out.println();
System.out.println(r);
System.out.println();
System.out.println(t);
System.out.println();
System.out.println(m);
System.out.println();
System.out.println(a);
System.out.println();
System.out.println(b);
System.out.println();

//Updates the objects
s.setShoeSize(12.5);
r.setColor("blue");
t.setQuantity(20);
m.setPrice(8.99);
a.setType("chain");
b.setBrand("Adidas");

//Prints the Updated data
System.out.println();
System.out.println("Updated Items: ");
System.out.println(s);
System.out.println();
System.out.println(r);
System.out.println();
System.out.println(t);
System.out.println();
System.out.println(m);
System.out.println();
System.out.println(a);
System.out.println();
System.out.println(b);
  }
}