package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zad.6. Napisz program, który tworzy przykładową ArrayListę zawierającą kolory. Wypisz\n" +
                "wszystkie utworzone kolory.");
        System.out.println(" W TYM ZADANIU POPROSZĘ o WSKAZÓWKI, jak MOŻNA LEPIEJ TO ZROBIć. ");
        System.out.println("Rozwiązanie: ");
        System.out.println("Ile kolorów chcesz wprowadzić?  ");
        int m = scanner.nextInt();
        List<String> colors=Ex0.getColorsFromScanner(m);
        System.out.print("Lista kolorów: " );
        colorsList(colors);

    }


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

}
