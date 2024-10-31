import java.util.HashMap;

public class Exercise8 {

  String id;
  String name;
  double price;
  int quantity;

  public Exercise8(String id, String name, double price, int quantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id='" + id + '\'' +
        ", name='" + name + '\'' +
        ", price=" + price +
        ", quantity=" + quantity +
        '}';
  }

  public static void main(String[] args) {
    HashMap<String, Exercise8> products = new HashMap<>();
    addProduct(products, "1", "Iphone 16", 1000, 80);
    addProduct(products, "2", "Iphone 15", 900,20);
    addProduct(products, "3", "Iphone 14", 800, 11);
    addProduct(products, "4", "Iphone 13", 700, 34);
    showProducts(products);
    findInfoProductBasedOnId(products, "2");
    deleteProductBasedOnId(products, "3");
    updateInfoProduct(products, "4", "Iphone 12", 600, 50);

  }
  private static void addProduct(HashMap<String, Exercise8> products, String id, String name, double price, int quantity) {
    Exercise8 product = new Exercise8(id, name, price, quantity);
    products.put(product.getId(), product);
  }

  private static void showProducts(HashMap<String, Exercise8> products) {
    for (String id : products.keySet()) {
      Exercise8 product = products.get(id);
      System.out.println(product.toString());
    }
  }

  private static void findInfoProductBasedOnId(HashMap<String, Exercise8> products, String id) {
    if(!products.containsKey(id)) {
      System.out.println("Product is not exist");
    } else{
      Exercise8 product = products.get(id);
      System.out.println(product.toString());
    }

  }

  public static void deleteProductBasedOnId(HashMap<String, Exercise8> products, String id) {
    if(!products.containsKey(id)) {
      System.out.println("Product is not exist");
    } else{
      products.remove(id);
    }
  }

  public static void updateInfoProduct(HashMap<String, Exercise8> products, String id, String name, double price, int quantity) {
    if(!products.containsKey(id)) {
      System.out.println("Product is not exist");
    } else{
      Exercise8 product = products.get(id);
      product.name = name;
      product.price = price;
      product.quantity = quantity;
      System.out.println("Product is updated");
      System.out.println(products.get(id).toString());
    }

  }
}
