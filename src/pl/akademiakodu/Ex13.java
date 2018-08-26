package pl.akademiakodu;

import java.util.LinkedList;
import java.util.List;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Zad.13. Napisz metodę, która zwraca liczbę różnych słów występujących w liście.\n" +
                "int getNumberDifferentWords(List<String> words); ");
        LinkedList<String> myQueue = new LinkedList<>();
        myQueue = Ex0.readingLinkedListFromScanner();
        System.out.println("Liczba różnych Stringów to: " + getNumberDifferentWords(myQueue));
        System.out.println("(*) Liczba różnych Stringów (PRZY INNYM WYWOŁANIU) to: " +
                getNumberDifferentWords(Ex12.convertingQueueToArrayList(myQueue)));
    }


    //do zadania 13
    private static int getNumberDifferentWords(List<String> linkedList){
        //int counter = 0;
        if (linkedList.size()==1){
            return linkedList.size();
        }
        else{
            for (int i=0; i<linkedList.size(); i++){
                for (int j=0; j<linkedList.size(); j++){
                    if(linkedList.get(i).equals(linkedList.get(j)) && i!=j){
                        linkedList.remove(j);
                    }
                }
            }
            return linkedList.size();
        }
    }

}
