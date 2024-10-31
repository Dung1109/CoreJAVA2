import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addElement(list,1);
        addElement(list,2);
        addElement(list,3);
        showElements(list);
        findMaxAndMinValue(list);
        removeElement(list, 2);
        checkExistElement(list, 2);
        checkExistElement(list, 3);

    }

    private static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    private static void showElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "");
            System.out.println();
        }
    }

    private static void findMaxAndMinValue(List<Integer> list) {
        int max = list.get(0);
        int min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }

    private static void removeElement(List<Integer> list, int element) {
        list.remove(element);
        showElements(list);
    }

    private static void checkExistElement(List<Integer> list, int element) {
        if (list.contains(element)) {
            System.out.println("Element " + element + " is exist in list");
        } else {
            System.out.println("Element " + element + " is not exist in list");
        }
    }
}