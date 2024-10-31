import java.util.ArrayList;
import java.util.HashMap;

public class Exercise6 {

  public static void main(String[] args) {
    ArrayList<Integer> prices = new ArrayList<>();
    prices.add(7);
    prices.add(1);
    prices.add(5);
    prices.add(3);
    prices.add(6);
    prices.add(4);
    prices.add(8);
    prices.add(2);
    prices.add(9);
    prices.add(10);

    findMaxProfit(prices);
  }

  private static void findMaxProfit(ArrayList<Integer> prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.size() - 1; i++) {
      for (int j = i + 1; j < prices.size(); j++) {
        if (prices.get(j) - prices.get(i) > maxProfit) {
          maxProfit = prices.get(j) - prices.get(i);
        }
      }
    }
    System.out.println("Max profit: " + maxProfit);
  }


}
