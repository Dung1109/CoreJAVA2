import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Exercise12 {

  String name;
  String code;

  Double price;

  Date date;

  public Exercise12(String name, String code, Double price, Date date) {
    this.name = name;
    this.code = code;
    this.price = price;
    this.date = date;
  }

  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    List<Exercise12> products = new ArrayList<>();
    Exercise12 product1 = new Exercise12("Product 1", "A01", 600.0, sdf.parse("2019-09-08"));
    ;
    Exercise12 product2 = new Exercise12("Product 2", "A02", 200.0, sdf.parse("2021-02-02"));
    Exercise12 product3 = new Exercise12("Product 3", "A03", 900.0, sdf.parse("2023-03-03"));
    Exercise12 product4 = new Exercise12("Product 4", "A04", 400.0, sdf.parse("2022-04-04"));
    Exercise12 product5 = new Exercise12("Product 5", "A05", 400.0, sdf.parse("2019-05-05"));
    products.add(product1);
    products.add(product2);
    products.add(product3);
    products.add(product4);
    products.add(product5);

//    sortByName(products);
//    sortByDate(products);
//    sortByPrice(products);
    sortByPriceAndDate(products);


  }

  private static void sortByPriceAndDate(List<Exercise12> products) {
    Collections.sort(products, Comparator.comparingDouble((Exercise12 e) -> e.price)
        .thenComparing(p -> p.date));
    System.out.println("Sorted by Price and Manufacture Date:");
    products.forEach(System.out::println);
  }

  private static void sortByName(List<Exercise12> products) {
    Collections.sort(products, Comparator.comparing(p -> p.name));
    System.out.println("Sorted by Name:");
    products.forEach(System.out::println);
  }

  private static void sortByPrice(List<Exercise12> products) {
    Collections.sort(products, Comparator.comparingDouble(p -> p.price));
    System.out.println("Sorted by Price:");
    products.forEach(System.out::println);
  }

  private static void sortByDate(List<Exercise12> products) {
    Collections.sort(products, Comparator.comparing(p -> p.date));
    System.out.println("Sorted by Manufacture Date:");
    products.forEach(System.out::println);

  }


  @Override
  public String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    return "Product{" +
        "name='" + name + '\'' +
        ", code='" + code + '\'' +
        ", price=" + price +
        ", date=" + sdf.format(date) +
        '}';

  }

}
