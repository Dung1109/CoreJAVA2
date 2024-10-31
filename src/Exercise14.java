import java.util.HashSet;

public class Exercise14 {

  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(6);
    set1.add(4);
    set1.add(5);
    HashSet<Integer> set2 = new HashSet<>();
    set2.add(4);
    set2.add(5);
    set2.add(6);
    set2.add(7);
    System.out.println("The common elements in 2 set are " +findCommonNumberOfTwoSets(set1, set2));

  }

  private static HashSet<Integer> findCommonNumberOfTwoSets(HashSet<Integer> set1, HashSet<Integer> set2) {
    HashSet<Integer> commonNumbers = new HashSet<>();
    for( int c : set1){
      if(set2.contains(c)){
        commonNumbers.add(c);
      }
    }
    return commonNumbers;
  }

}
