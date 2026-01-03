package App;

import java.util.*;

public class Main {
    public static void main(String[] args) {
     String tekst = "Zdanie moze byc ze spacjami";
     Map<Character, Integer> mapa = Zliczanie.zliczanie(tekst);

     System.out.println(mapa);
     Huffman huffman = new Huffman();
     Node korzen = huffman.budowanieDrzewa(mapa);
     System.out.println(korzen);
     
     Map <Character, String> mapa2 = new HashMap<>();
     huffman.tworzenieSlownika(korzen, mapa2, "");
     System.out.println(mapa2);
     
     
     
     
//     System.out.println(fib(7));
//     liczenie(3);
//     System.out.println(silnia(5));
//     odwracanie(tekst);
//     System.out.println("---------------");
//     wypisywanieDrzewa(3, "korzen", " ");


    }
    
    static int fib (int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int silnia(int n){
        if (n==1){
            return 1;
        }
        return (n*silnia(n-1));
    }

    static void odwracanie(String tekst){
        if (tekst.length() == 0){
            return;
        }
        odwracanie(tekst.substring(1));
        System.out.print(tekst.charAt(0));
    }

    static void wypisywanieDrzewa(int n, String kierunek, String wciecie){
        if (n == 0){
            return;
        }
        System.out.println( wciecie +"|---"+  "(" + n+kierunek+ ")");
        wypisywanieDrzewa(n-1, "L",wciecie + "     ");
        wypisywanieDrzewa(n-1, "P", wciecie + "     ");

    }


    static void liczenie(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        liczenie(n-1);
        System.out.println(n);
    }
}
