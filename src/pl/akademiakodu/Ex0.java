package pl.akademiakodu;

import java.util.*;

public class Ex0 {
    public static void main(String[] args) {
        System.out.println("Wczytywanie macierzy potrzebnych w innych zadaniach. ");
    }


    //ponizej odczytywanie macierzy
    public static List<Integer> getListFromScanner() {
        List<Integer> array = new ArrayList<>();
        System.out.println("Wczytujemy macierz liczbową. ");
        System.out.println("Podaj liczbe elementow: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbe: " + (i + 1));
            array.add(scanner.nextInt()); //array[i] = scanner.nextInt();
        }
        return array;
    }


    //ponizej odczytywanie słów do tłumaczenia (doctionary)
    public static List<String> getDictionaryFromScanner(){
        List<String> array = new ArrayList<>();
        System.out.println("Podaj liczbe słów: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Podaj polskie słowo do tłumaczenia: " + (i+1));
            array.add(scanner.next()); //array[i] = scanner.nextInt();
        }
        return array;
    }


    //do zadania 6: wczytywanie kolorów
    public static List<String> getColorsFromScanner(int n){
        List<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Podaj kolor " + (i+1));
            array.add(scanner.next()); //array[i] = scanner.nextInt();
        }
        return array;
    }


    //metoda wczytywania elemnetow LOSOWEJ tablicy (zad.9 i kolejne)
    public static List<Integer> randomArrayFromScanner(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj liczbe elementow tablicy: ");
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i=0; i<n; i++){
            array.add(random.nextInt(100));
        }
        System.out.println("Twoja tablica to: ");
        for (int i=0; i<n; i++){
            System.out.print(array.get(i)+", ");
        }
        return array;
    }


    //do zadania 12
    public static LinkedList<String> readingLinkedListFromScanner (){
        LinkedList<String> myLinkedList = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką długość ma mieć LinkedList? ");
        int n=scanner.nextInt();
        for (int i=0; i<n; i++ ){
            System.out.println("Podaj elelement do LinkedList: ");
            String elLinkedList = scanner.next();
            myLinkedList.add(elLinkedList);
        }
        return myLinkedList;
    }


}
