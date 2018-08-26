package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Zad.2. Napisz metodę, która dla danej listy zwraca nową posortowaną listę.\n" +
                "List<Integer> getSortedList(List<Integer> numbers);");
        List<Integer> matrix = Ex0.getListFromScanner();
        System.out.println("Wczytana MATRIX to: " + matrix);
        System.out.println("Zad.2. Posortowana rosnąco MATRIX: " + getSortedIncreasingList(matrix));
        System.out.println("Zad.*  Posortowana malejąco MATRIX: " + getSortedDecreasingList(matrix));

    }


    //zadanie 2* z Kolekcji: sortowanie listy malejąco
    private static List<Integer> getSortedDecreasingList(List<Integer> numbers){
        List<Integer> returnedArray = new ArrayList<>();
        int temp=0;
        for (int i=0; i<numbers.size(); i++){
            returnedArray.add(numbers.get(i));
        }
        for (int i=0; i<returnedArray.size(); i++){
            for (int j=0; j<i; j++){
                if (returnedArray.get(i)>returnedArray.get(j)){
                    temp = returnedArray.get(i);
                    returnedArray.add(i,returnedArray.get(j));
                    returnedArray.remove(i+1);
                    returnedArray.add(j,temp);
                    returnedArray.remove(j+1);
                }
            }
        }
        return returnedArray;
    }


    //zadanie 2 z Kolekcji: sortowanie listy rosnąco
    private static List<Integer> getSortedIncreasingList(List<Integer> numbers){
        List<Integer> returnedArray = new ArrayList<>();
        int temp=0;
        for (int i=0; i<numbers.size(); i++){
            returnedArray.add(numbers.get(i));
        }
        for (int i=0; i<returnedArray.size(); i++){
            for (int j=0; j<i; j++){
                if (returnedArray.get(i)<returnedArray.get(j)){//><
                    temp = returnedArray.get(i);
                    returnedArray.add(i,returnedArray.get(j));
                    returnedArray.remove(i+1);
                    returnedArray.add(j,temp);
                    returnedArray.remove(j+1);
                }
            }
        }
        return returnedArray;
    }

}
