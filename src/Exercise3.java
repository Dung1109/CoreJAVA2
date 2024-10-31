import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<>();
        addElement(person, "Huy", 20);
        addElement(person, "Hoa", 22);
        addElement(person, "Hai", 23);
        showElements(person);
        findAgePersonByName(person, "Huy");
        removeOnePerson(person, "Huy");
        checkOnePersonExist(person, "Huy");
        checkOnePersonExist(person, "Hoa");

    }

    private static void addElement(HashMap<String, Integer> person, String name, int age) {
        person.put(name, age);
    }

    private static void showElements(HashMap<String, Integer> person) {
        for (String name : person.keySet()) {
            System.out.println(name + " " + person.get(name));
        }
    }

    private static void findAgePersonByName(HashMap<String, Integer> person, String nameOfPerson) {
        for (String name : person.keySet()) {
           if(name.equals(nameOfPerson)) {
               System.out.println("The age of " +  name + " is " + person.get(name));
           }
        }
    }

    private static void removeOnePerson(HashMap<String, Integer> person, String nameOfPerson) {
        person.remove(nameOfPerson);
    }

    private static void checkOnePersonExist(HashMap<String, Integer> person, String nameOfPerson) {
        if(person.containsKey(nameOfPerson)) {
            System.out.println("The person " + nameOfPerson +  " is exist");
        } else {
            System.out.println("The person " + nameOfPerson +  " is not exist");
        }
    }
}
