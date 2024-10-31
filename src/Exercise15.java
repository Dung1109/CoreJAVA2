import java.util.HashSet;

public class Exercise15 {

  public static void main(String[] args) {
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(1);
    set1.add(2);
    set1.add(6);
    set1.add(4);
    set1.add(5);
    System.out.println("The set is " + set1);
    findMaxAndMinInASet(set1);
  }

  private static void findMaxAndMinInASet(HashSet<Integer> set1){
    int max = set1.stream().max(Integer::compare).orElseThrow();
    int min = set1.stream().min(Integer::compare).orElseThrow();
    System.out.println("Max: " + max + " Min: " + min);
  }
}
