package pl.akademiakodu;

import java.util.List;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Zad.7. Napisz implementacje następującej metody::\n" +
                "int findIndexOfColor(String color, List <String> colors)\n" +
                "Metoda powinna zwracać index na którym występuje dany kolor w liście bądź -1\n" +
                "jeśli taki kolor nie występuje w liście.");
        System.out.println(" W TYM ZADANIU POPROSZĘ o WSKAZÓWKI, jak MOŻNA LEPIEJ TO ZROBIć. ");
        System.out.println("Rozwiązanie: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile kolorów chcesz wprowadzić?  ");
        int m = scanner.nextInt();
        List<String> colors=Ex0.getColorsFromScanner(m);
        System.out.println("Zad.7. Indeksy kolorów: ");
        for (int i=0; i<colors.size();i++){
            System.out.print(colors.get(i)+" - "+findIndexOfColor(colors.get(i), colors)+"; ");
        }
    }


    private static int findIndexOfColor(String color, List <String> colorList){
        return colorList.indexOf(color);
    }

}
