import java.util.HashMap;
import java.util.Scanner;

public class Exercise11 {

  public static void main(String[] args) {
    HashMap<String, String> dictionary = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    int choice;
    do {
      showMenu();
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.println("Enter word: ");
          String word = sc.nextLine();
          System.out.println("Enter meaning: ");
          String meaning = sc.nextLine();
          createNewWordInDictionary(dictionary, word, meaning);
          break;
        case 2:
          System.out.println("Enter word to search: ");
          String searchWord = sc.nextLine();
          searchWordInDictionary(dictionary, searchWord);
          break;
        case 3:
          System.out.println("Exit program");
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 3);

  }

  private static void searchWordInDictionary(HashMap<String, String> dictionary, String searchWord) {
    if (dictionary.containsKey(searchWord)) {
      System.out.println("Meaning: " + dictionary.get(searchWord));
    } else {
      System.out.println("Word not found");
    }
  }

  private static void showMenu() {
    System.out.println("1. Add new word to dictionary: " );
    System.out.println("2. Search word in dictionary: ");
    System.out.println("3. Exit");
  }

  private static void createNewWordInDictionary(HashMap<String, String> dictionary, String word, String meaning) {
    dictionary.put(word, meaning);
  }

}
