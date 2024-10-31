import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise10 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> grade = new HashMap<>();

    System.out.println("Enter number of students:");
    int numberOfStudents = scanner.nextInt();

    for (int i = 0; i < numberOfStudents; i++) {
      System.out.println("Enter score of student " + (i + 1) + ":");
      double score = scanner.nextDouble();

      if (score >= 8.0) {
        updateGradeCount(grade, "High score  (>= 8.0)");
      } else if (score >= 5.0) {
        updateGradeCount(grade, "Medium score (>= 5.0 và < 8.0)");
      } else {
        updateGradeCount(grade, "Fail (< 5.0)");
      }
    }

    System.out.println("Scores contribution:");
    for (Map.Entry<String, Integer> entry : grade.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

  }

  private static void updateGradeCount(HashMap<String, Integer> grade, String category) {
    grade.put(category, grade.getOrDefault(category, 0) + 1);
  }


}





