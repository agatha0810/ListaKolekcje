package pl.akademiakodu;

import java.util.*;

public class ExTogether {

    public static void main(String[] args) {
        List<Integer> array = getListFromScanner();
        System.out.println("Zadania z KOLEKCJI.");
        System.out.println("Wczytana ARRAY to: " + array);
        System.out.println("Zadania z kolekcji robione za zajęciach 1 oraz 8: ");
        System.out.println("Zad.1. Liczby podzielne przez 3 to: " + getDividedByThree(array));
        System.out.println("Zad.*  Liczby posortowane to: " + getSortedList(array));
        System.out.println("Zad.8. Odwrócona lista to " + reverseList(array));
        //ponizej inna metoda odwracania w listach:
        System.out.print("Zad.* Odwrócenie inną metodą: ");
        Collections.reverse(array);
        System.out.println(array);
        System.out.println("Poniżej zadania robione samodzielnie poza lekcją. Wczytujemy następną macierz. ");
        List<Integer> matrix = getListFromScanner();
        System.out.println("Wczytana MATRIX to: " + matrix);
        System.out.println("Zad.2. Posortowana rosnąco MATRIX: " + getSortedIncreasingList(matrix));
        System.out.println("Zad.*  Posortowana malejąco MATRIX: " + getSortedDecreasingList(matrix));
        System.out.println("Zad.3. Liczba wystąpień: ");
        numberOfOccurrences(matrix);
        System.out.println("Zad.4. SŁOWNIK (słowa przetłumaczone: mama, tata, witaj, pies, kot): ");
        //wczytujemy słownik do zadania 4:
        List<String> dictionary = getDictionaryFromScanner();
        dictionaryList(dictionary);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zad.5. Zamiana liczby na system dwójkowy. Jaką liczbę chcesz zamienić? ");
        int n = scanner.nextInt();
        System.out.println("5. Liczba "+n+ " w systemie dwojkowym to: " + convertTo(n) );
        System.out.println("5* Z powrotem: "+convertTo(n)+" w sytemie dziesiętnym to "+convertFrom(convertTo(n)));

        System.out.println("Zad.6. Ile kolorów chcesz wprowadzić?  ");
        int m = scanner.nextInt();
        List<String> colors=getColorsFromScanner(m);

        System.out.print("lista kolorów: " );
        colorsList(colors);
        //TO DO
        System.out.println();
        System.out.println("Zad.7. Indeksy kolorów: ");
        for (int i=0; i<colors.size();i++){
            System.out.print(colors.get(i)+" - "+findIndexOfColor(colors.get(i), colors)+"; ");
        }
        System.out.println("\n Do poniższych zadań będzie nowa macierz losowa. ");
        List<Integer> myList=randomArrayFromScanner();
        //randomArrayFromScanner();
        System.out.println("Zad.9. Maksymalny element losowej listy to: " + maxElementOfList(myList));
        System.out.println("Zad.10. Jaki element chcesz dodać do losowej macierzy? ");
        int element = scanner.nextInt();
        System.out.println("Podaj numer indeksu, do którego ma być przypisany twój lement? ");
        int index = scanner.nextInt();
        System.out.println("Rezultat dodania elelemntu do listy to lista: "+addElementToList(myList, element, index));
        System.out.println("Zad.11. Który element chcesz zamienić? ");
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
        LinkedList<String> myQueue = new LinkedList<>();
        myQueue = readingLinkedListFromScanner();
        System.out.println("Zad.12. Przekonwertowany LinkedList to ArrayList: "
                +convertingQueueToArrayList(myQueue));
        System.out.println("Zad.13. Liczba różnych Stringów to " + getNumberDifferentWords(myQueue));
        System.out.println("Zad.13 * Liczba różnych Stringów przy innym wywołaniu to " +
                getNumberDifferentWords(convertingQueueToArrayList(myQueue)));
        System.out.println();
        System.out.println("Zad. 14, 15, 16 - TO DO together with Algorythms. ");
        //-----------------------------------------------------------------------
        System.out.println("KONIEC. ");
        //=============================

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


    //ponizej odczytywanie macierzy
    private static List<Integer> getListFromScanner(){
        List<Integer> array = new ArrayList<>();
        System.out.println("Podaj liczbe elementow: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Podaj liczbe: " + (i+1));
            array.add(scanner.nextInt()); //array[i] = scanner.nextInt();
        }
        return array;
    }


    //ponizej odczytywanie macierzy
    private static List<String> getDictionaryFromScanner(){
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


    //sortowanie listy: gotowa metoda * (NIE z listy z Kolekcji)
    private static List<Integer> getSortedList(List<Integer> numbers){
        Collections.sort(numbers); //gotowa metoda sortowania
        return numbers;
    }


    //metoda do Zadania 8: odwracanie elementow listy
    private static List<Integer> reverseList(List<Integer> array) {
        List<Integer> returnedArray = new ArrayList<>();
        // idziemy od elementu ostatniego do elementu 0, zmniejszamy i o 1
        for (int i = array.size() - 1; i >= 0; i--) {
            returnedArray.add(array.get(i));
        }
        return returnedArray;
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


    //zadanie 4 z KOLEKCJI:
    private static void dictionaryList(List<String> dictionary){
        Map<String,String > dictionaryHelp = new HashMap<>();

        dictionaryHelp.put("witaj", "hello");
        dictionaryHelp.put("pies", "dog");
        dictionaryHelp.put("kot", "cat");
        dictionaryHelp.put("mama","mother");
        dictionaryHelp.put("tata","father");

        for(String value: dictionary){
            System.out.println(dictionaryHelp.get(value));
        }
    }


    //  do zadania 5-tego z KOLEKCJI:
    public static String convertTo(int n) {
        String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        if (n == 0){
            return "0";
        }
        while (n>0) {
            result = pattern.charAt(n % 2) + result;
            n /= 2;
        }
        return result;
    }


    //  do zadania 5-tego z KOLEKCJI:
    private static int valueOf(char x) {
        String pattern = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<2; i++) {
            if (x == pattern.charAt(i)) {
                return i;
            }
        }
        return -1;
    }


    //  do zadania 5-tego z KOLEKCJI*
    private static int convertFrom(String n) {
        int i, x;
        int p = 1;
        int result = 0;
        n = n.toUpperCase();
        for (i=n.length()-1; i>=0; i--) {
            x = valueOf(n.charAt(i));
            if (x < 0) {
                return 0;
            }
            result += (x * p);
            p *= 2;
        }
        return result;
    }


    //do zad. 6-tego wczytywanie kolorow:
    private static List<String> getColorsFromScanner(int n){
        List<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Podaj kolor " + (i+1));
            array.add(scanner.next());
        }
        return array;
    }


    //zadanie 6 z KOLEKCJI:
    private static void colorsList(List<String> colorList) {
        for (int i=0; i< colorList.size();i++){
            for (int j=0; j< colorList.size();j++) {
                if (colorList.get(i).equals(colorList.get(j)) && (i!=j)) {
                    colorList.remove(j);
                }
            }
        }
        for (int j=0; j< colorList.size()-1;j++) {
            if (colorList.get(j).equals(colorList.get(j+1))) {
                colorList.remove(j+1);
            }
        }
        for (int i=0; i< colorList.size();i++){
            System.out.print(" "+colorList.get(i)+", ");
        }
    }


    private static int findIndexOfColor(String color, List <String> colorList){
        return colorList.indexOf(color);
    }


    //metoda wczytywania elemnetow tablicy
    private static List<Integer> randomArrayFromScanner(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Podaj liczbe elementow tablicy");
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


    //metoda do zadania 9: wypisywanie najwiekszego elementu Listy
    private static int maxElementOfList(List<Integer> listElements) {
        int max = Collections.max(listElements);
        return max;
    }


    //metoda do zadania 10: WYRZUC to wypisywanie do maina !!
    private static List<Integer> addElementToList (List<Integer> listElements, int elemement, int index){
        if (index<listElements.size()){
            listElements.add(index-1, elemement);
        }else {
            System.out.print("Podano za duzy indeks. ");
        }
        return listElements;
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


    //do zadania 12
    private static LinkedList<String> readingLinkedListFromScanner (){
        LinkedList<String> myLinkedList = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką długość ma mieć LinkedList? ");
        int n=scanner.nextInt();
        for (int i=0; i<n; i++ ){
            System.out.println("Podaj elelement String do LinkedList: ");
            String elLinkedList = scanner.next();
            myLinkedList.add(elLinkedList);
        }
        return myLinkedList;
    }


    //do zadania 12
    private static ArrayList<String> convertingQueueToArrayList (LinkedList<String> myQueue){
        ArrayList<String> myArrayList = new ArrayList<>();
        for (String value: myQueue){
            myArrayList.add(value);
        }
        return myArrayList;
    }


    //do zadania 13
    private static int getNumberDifferentWords(List<String> linkedList){
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


