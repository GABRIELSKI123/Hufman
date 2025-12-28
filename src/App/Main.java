package App;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String zdanie = "Litwo ojczyzno moja ty jestes jak zdrowie";
//        Map <Character, Integer> czestotliwosc = Zliczanie.zliczanie(zdanie);
//        System.out.println(czestotliwosc);
//
//        PriorityQueue<Integer> kolejka = new PriorityQueue<>();
//
//        List <Integer> lista = Arrays.asList(1,1,2,4);
//        kolejka.addAll(lista);
//
//        while (kolejka.size() > 1){
//
//            int a = kolejka.poll();
//            int b = kolejka.poll();
//            int suma = a + b;
//            System.out.println("a: " + a + ", b: " + b + ", suma: " +suma);
//
//            //..............
//            kolejka.add(suma);
//        }
        PriorityQueue<Integer> kolejka2 = new PriorityQueue<>();
        Map<Character, Integer> lista2 = new HashMap<>();
        lista2.put('c', 5);
        lista2.put('a', 2);
        lista2.put('d', 3);
        lista2.put('r', 1);
        lista2.put('g', 1);
        lista2.put('y', 1);

        for (Character x : lista2.keySet()) {
            kolejka2.add(lista2.get(x));
        }
        System.out.println(kolejka2);
        while (kolejka2.size() > 1) {
            int a = kolejka2.poll();
            int b = kolejka2.poll();
            int suma = a + b;
            System.out.println("a:" + a + "b:" + b + "suma:" + suma);
            kolejka2.add(suma);
        }
        System.out.println("korzen =" + kolejka2.peek());



        Map<Character, Integer> mapa3 = new HashMap<>();
        mapa3.put('c', 5);
        mapa3.put('b', 6);
        mapa3.put('s', 2);
        mapa3.put('p', 2);
        mapa3.put(' ', 6);

        PriorityQueue<SmallNode> kolejkaNode = new PriorityQueue<>();
        for(Character x : mapa3.keySet()){
            kolejkaNode.add(new SmallNode(x, mapa3.get(x)));
        }



   }
    static class SmallNode implements Comparable<SmallNode>{
        public Character znak;
        public int czestotliwosc;

        public SmallNode(Character znak, Integer czestotliwosc){
            this.czestotliwosc = czestotliwosc;
            this.znak = znak;
        }
        @Override
        public int compareTo(SmallNode sm){
            return Integer.compare(this.czestotliwosc, sm.czestotliwosc);
        }
    }
}
