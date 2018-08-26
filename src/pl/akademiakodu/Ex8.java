package pl.akademiakodu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex8 {
    public static void main(String[] args) {
        List<Integer> array = Ex0.getListFromScanner();
        System.out.println("Zad.8. Napisz metodę, która zwraca listę elementów w odwróconej kolejności. \n"+
                "(ROBIONE NA ZAJĘCIACH). ");
        System.out.println("Zad.8. Odwrócona lista to " + reverseList(array));
        //ponizej inna metoda odwracania w listach:
        System.out.print("Zad.* Odwrócenie inną metodą: ");
        Collections.reverse(array);
        System.out.println(array);

    }


    //metoda do Zadania 8: odwracanie elementow listy
    private static List<Integer> reverseList(List<Integer> array) {
        List<Integer> returnedArray = new ArrayList<>();
        // idziemy od elementu ostatniego do elementu 0, zmniejszamy i o 1
        for (int i = array.size() - 1; i >= 0; i--) {
            returnedArray.add(array.get(i));
        }
        return returnedArray;
    }


}
