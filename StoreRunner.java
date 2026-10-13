public class StoreRunner {
/*
* Creates shoes, products, and accessories, displays their information,
* and tests accessor and mutator methods.
*/
public static void main(String[] args) {
// Create a shoe using the parameterized constructor.
Shoes s = new Shoes("Jordan 4's", 210.00, 20, 13.0, "Red and Black");
// Create a shoe using the no-argument constructor.
Shoes r = new Shoes();
// Create a shoe using the overloaded parameterized constructor.
Shoes y = new Shoes("Tennis Shoes", 70.00, 8, 10);
// Create products using both constructors.
Product t = new Product("shirt", 40.00, 30);
Product m = new Product();
// Create accessories using both constructors.
Accessory a = new Accessory();
Accessory b = new Accessory("Baseball hat", 25.00, 20, "Hat", "Nike");
// Print the original information for every object.
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
System.out.println(y);
System.out.println();
// Update the objects using mutator methods.
s.setShoeSize(12.5);
r.setColor("blue");
t.setQuantity(20);
m.setPrice(8.99);
a.setType("chain");
b.setBrand("Adidas");
y.setName("cleats");
// Print the updated information for every object.
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
System.out.println();
System.out.println(y);
}
}