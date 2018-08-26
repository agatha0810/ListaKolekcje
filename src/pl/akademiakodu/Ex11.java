package pl.akademiakodu;

import java.util.List;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zad.11. Napisz program z przykładową LinkedList liczb całkowitych.\n"+
                " Zamień element 0 i 2 Listy.");
        System.out.println("Uogólniłam to zadanie. ");
        System.out.println("Rozwiązanie (z użyciem macierzy losowej): ");
        List<Integer> myList=Ex0.randomArrayFromScanner();
        System.out.println("\n Który element chcesz zamienić? ");
        int firstEl = scanner.nextInt();
        System.out.println("Z którym elementem chcesz go zamienić? ");
        int secondEl = scanner.nextInt();
        if (firstEl>0 && firstEl<=myList.size() && secondEl>0 && secondEl<=myList.size() && firstEl != secondEl){
            System.out.println(changingPlacesOfElements(myList, firstEl-1, secondEl-1));
        }else if (firstEl>0 && firstEl<=myList.size() && secondEl>0 && secondEl<=myList.size() && firstEl == secondEl){
            System.out.println("podałeś ten sam element, więc nie ma czego zamieniać. ");
        }else {
            System.out.println("Zamiana jest niemożliwa, bo podałeś element spoza zakresu. ");
        }
    }


    //metoda do zadania 11: sprawdzic skrajne elementy:
    private static List<Integer> changingPlacesOfElements(List<Integer> listElements, int firstEl, int secondEl){
        int firstValue, secondValue;
        int helpMin, helpMax;
        if (firstEl<secondEl){
            helpMin = firstEl;
            helpMax = secondEl;
        }else {
            helpMin = secondEl;
            helpMax = firstEl;
        }
        firstValue = listElements.get(firstEl);
        secondValue = listElements.get(secondEl);
        listElements.remove(helpMin);//usunelam min+1, max+1 jest o 1 nizej
        listElements.add(helpMin,secondValue);//wstawiam na min+ ten drugi, max+1 jest na swojej pozycji
        listElements.remove(helpMax); //usunelam max, wszystkie za nim są niżej
        listElements.add(helpMax,firstValue);
        return listElements;
    }

}
