import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise7 {
  public static void main(String[] args) {
    HashMap<String, List<Integer>> students = new HashMap<>();
    addInForStudents(students, "Duc", List.of( 90, 80, 70));
    addInForStudents(students, "Nam", List.of( 85, 75, 95));
    addInForStudents(students, "Duc", List.of( 100, 90, 80));
    addInForStudents(students, "Dung", List.of( 95, 80, 75));
    calculateAverScores(students);

  }

  private static void addInForStudents(HashMap<String, List<Integer>> students, String name, List<Integer> score) {
    if (students.containsKey(name)) {
      students.get(name).addAll(score);
    } else {
      List<Integer> scores = new ArrayList<>();
      scores.addAll(score);
      students.put(name, scores);
    }
  }

  private static void calculateAverScores(HashMap<String, List<Integer>> students) {
    for (String name : students.keySet()) {
      List<Integer> scores = students.get(name);
      int sum = 0;
      for (int score : scores) {
        sum += score;
      }
      double average = (double) sum / scores.size();
      String averageStr = String.format("%.2f", average);
      System.out.println( name + ": " + averageStr);
    }
  }

}
