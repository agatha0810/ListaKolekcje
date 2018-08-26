package pl.akademiakodu;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("Napisz program, który zamienia liczbę całkowitą na liczbę w systemie binarnym.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zad.5. Zamiana liczby na system dwójkowy. Jaką liczbę chcesz zamienić? ");
        int n = scanner.nextInt();
        System.out.println("5. Liczba "+n+ " w systemie dwojkowym to: " + convertTo(n) );
        System.out.println("5* Z powrotem: "+convertTo(n)+" w sytemie dziesiętnym to "+convertFrom(convertTo(n)));

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


}
