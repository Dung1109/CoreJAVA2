import java.util.HashMap;
import java.util.List;

public class Exercise9 {

  public static void main(String[] args) {
    HashMap<List<String>, Integer> numberAppearOfWord = new HashMap<>();
    countWord(numberAppearOfWord, "      hello world. my name is     Dung. Welcome to my world, I always say hello to the world.");
  }

  private static void countWord(HashMap<List<String>, Integer> numberAppearOfWord, String str) {
    str = str.replaceAll("[^a-zA-Z ]", "").trim();
    String[] words = str.split("\\s+") ;
    for (String word : words) {
      int count = 0;
      for (String word1 : words) {
        if (word.equals(word1)) {
          count++;
        }
      }
      numberAppearOfWord.put(List.of(word), count);
    }
    System.out.println(numberAppearOfWord);
  }

}
