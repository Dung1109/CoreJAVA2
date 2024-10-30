import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3,8,30,6,5,10,4));
        sortList(list);
        reverseSortList(list);
    }

    public static void sortList(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void reverseSortList(ArrayList<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
