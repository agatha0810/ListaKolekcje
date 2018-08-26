package pl.akademiakodu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Napisz program, który symuluje działanie słownika polsko-angielskiego.");
        System.out.println("Zad.4. SŁOWNIK (słowa przetłumaczone: mama, tata, witaj, pies, kot): ");
        List<String> dictionary = Ex0.getDictionaryFromScanner();
        dictionaryList(dictionary);
    }


    //zadanie 4 z KOLEKCJI:
    private static void dictionaryList(List<String> dictionary){
        Map<String,String > dictionaryHelp = new HashMap<>();
        //Map<String,String > mapHelp = new HashMap<>();

        dictionaryHelp.put("witaj", "hello");
        dictionaryHelp.put("pies", "dog");
        dictionaryHelp.put("kot", "cat");
        dictionaryHelp.put("mama","mother");
        dictionaryHelp.put("tata","father");

        for(String value: dictionary){
            System.out.println(dictionaryHelp.get(value));
        }
    }


}
