package pl.akademiakodu;

import java.util.Collections;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("Zad.9. Napisz metodę, która zwraca maksymalny element Listy. ");
        System.out.println("Do tego zadania będzie nowa macierz losowa. ");
        List<Integer> myList=Ex0.randomArrayFromScanner();
        System.out.println("\n Zad.9. Maksymalny element losowej listy to: " + maxElementOfList(myList));
    }

    //metoda do zadania 9: wypisywanie najwiekszego elementu Listy
    private static int maxElementOfList(List<Integer> listElements) {
        int max = Collections.max(listElements);
        return max;
    }

}
