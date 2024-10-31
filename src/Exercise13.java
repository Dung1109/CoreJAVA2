import java.util.HashSet;
import java.util.List;

public class Exercise13 {

  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,1,2,24,5,1,5,6,4};
    findNumberNotUniqueInArray(numbers);
  }

  private static void findNumberNotUniqueInArray(int[] numbers){
    HashSet<Integer> allNumbersInArray = new HashSet<>();
    HashSet<Integer> repeatedNumbers = new HashSet<>();
    for(int c : numbers){
      if(!allNumbersInArray.contains(c)){
        allNumbersInArray.add(c);
      } else {
        repeatedNumbers.add(c);
      }
    }
    System.out.println("Numbers that are not unique in the array: " + repeatedNumbers);
  }

}
