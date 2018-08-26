package pl.akademiakodu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Zad.12. Napisz metodę, która konwertuje LinkedList do ArrayListy. ");
        System.out.println("NIE WIEM, czy DOBRZE ZROZUMIAŁAM to ZADANIE...? ");
        LinkedList<String> myQueue = new LinkedList<>();
        myQueue = Ex0.readingLinkedListFromScanner();
        System.out.println("Zad.12. Przekonwertowany LinkedList to ArrayList: "
                +convertingQueueToArrayList(myQueue));

    }


    //do zadania 12 (metoda ta użyta jest również w zadaniu 13, więc jest PUBLIC)
    public static ArrayList<String> convertingQueueToArrayList (LinkedList<String> myQueue){
        ArrayList<String> myArrayList = new ArrayList<>();
        for (String value: myQueue){
            myArrayList.add(value);
        }
        return myArrayList;
    }



}
