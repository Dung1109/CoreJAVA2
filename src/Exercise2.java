import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {
        HashSet<String> listNational = new HashSet<>();
        addNational(listNational,"Viet Nam");
        addNational(listNational,"USA");
        addNational(listNational,"Japan");
        showNational(listNational);
        removeNational(listNational,"USA");
        calculateNumberNational(listNational);
        checkNationExistInList(listNational,"Viet Nam");
        checkNationExistInList(listNational,"USA");

    }

    public static void addNational(HashSet<String> national, String nameCountry) {
        national.add(nameCountry);

    }

    public static void showNational(HashSet<String> national) {
        for (String nameCountry : national) {
            System.out.println(nameCountry);
        }
    }

    public static void removeNational(HashSet<String> national, String nameCountry) {
        national.remove(nameCountry);
        showNational(national);
    }

    public static void calculateNumberNational(HashSet<String> national) {
        System.out.println("Number of national: " + national.size());
    }

    public static void checkNationExistInList(HashSet<String> national, String nameCountry) {
        if (national.contains(nameCountry)) {
            System.out.println("National " + nameCountry + " is exist in list");
        } else {
            System.out.println("National " + nameCountry + " is not exist in list");
        }
    }
}
