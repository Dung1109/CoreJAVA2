import java.util.ArrayList;
import java.util.Arrays;
public class Exercise5 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 30, 6, 5, 10, 4));
        int target = 10;
        findIndexOfElement(list, target);
    }

    private static void findIndexOfElement(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    System.out.println("Index of two elements that sum up to target: " + i + " " + j);
                }
            }
        }
    }
}
