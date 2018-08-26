package pl.akademiakodu;

import java.util.List;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zad.5 Napisz program, który utworzy przykładową LinkedList liczb całkowitych\n" +
                "(conajmniej 5 elementów). Do utworzonej listy dodaj element na indeksie numer\n" +
                "2.");
        System.out.println("Rozwiązanie (z użyciem macierzy losowej): ");
        System.out.println("DLA 'WYGODY' ZREZYGNOWAŁAM z MIN.5elementów. ");
        List<Integer> myList=Ex0.randomArrayFromScanner();
        System.out.println("\n Zad.10. Jaki element chcesz dodać do losowej macierzy? ");
        int element = scanner.nextInt();
        System.out.println("Podaj numer indeksu, do którego ma być przypisany twój lement? ");
        int index = scanner.nextInt();
        System.out.println("Rezultat dodania elelemntu do listy to lista: "+addElementToList(myList, element, index));

    }


    //podajemy wartość, a potem indeks, na jaki chcemy dać żądaną wartość:
    private static List<Integer> addElementToList (List<Integer> listElements, int elemement, int index){
        if (index<listElements.size()){
            listElements.add(index-1, elemement);
        }else {
            System.out.print("Podano za duzy indeks. ");
        }
        return listElements;
    }

}
