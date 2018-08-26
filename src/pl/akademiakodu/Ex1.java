package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Zad.1. Napisz metodę, która dla danej listy zwraca nową listę elementów, które są\n" +
                "podzielne przez 3 (ROBIONE NA ZAJĘCIACH). ");
        List<Integer> array = Ex0.getListFromScanner();
        System.out.println("Zad.1. Liczby podzielne przez 3 to: " + getDividedByThree(array));

    }

    //metoda do zadania 1 z Kolekcji:
    static List<Integer> getDividedByThree(List<Integer> numbers){
        List<Integer> returnArray = new ArrayList<>();
        for (int value: numbers){
            if (value%3 == 0){
                returnArray.add(value);
            }
        }
        return returnArray;
    }

}