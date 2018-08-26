package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Napisz program, który odczytuje n liczb i wypisuje liczbę wystąpień danej liczby.");
        System.out.println(" W TYM ZADANIU POPROSZĘ o WSKAZÓWKI, jak MOŻNA LEPIEJ TO ZROBIć. ");
        List<Integer> matrix = Ex0.getListFromScanner();
        System.out.println("Zad.3. Liczba wystąpień: ");
        numberOfOccurrences(matrix);
    }

    //zadanie 3 z KOLEKCJI: liczba wystąpień
    private static void numberOfOccurrences(List<Integer> array) {
        List<Integer> returnedArray = new ArrayList<>();
        int[][] helpArray = new int[array.size()][2];
        int k;
        for (int i=0; i<array.size(); i++){
            k=0;
            for (int j=0; j<array.size(); j++){
                if ( array.get(i)==array.get(j)  ){
                    k++;
                }
            }
            helpArray[i][0]=array.get(i);
            helpArray[i][1]=k;
            System.out.println("Element "+helpArray[i][0]+" wystąpił "+helpArray[i][1]+" razy. ");
        }
    }

}
