package App;
import java.util.*;

public class Huffman {
    public Node budowanieDrzewa(Map<Character, Integer> mapa) {
        PriorityQueue<Node> kolejkaNode = new PriorityQueue<>();

        //tworzenie liści
        for(Character znak : mapa.keySet()) {
            kolejkaNode.add(new Node(znak, mapa.get(znak), null, null));
        }
        while (kolejkaNode.size() > 1){
            Node a = kolejkaNode.poll();
            Node b = kolejkaNode.poll();
            int suma = a.czestotliwosc + b.czestotliwosc;
            Node rodzic = new Node(null, suma,a,b);
            kolejkaNode.add(rodzic);
        }
        return kolejkaNode.poll();
    }
    public void tworzenieSlownika(Node node, Map<Character, String> mapa, String kod){
        if (node == null){
            return;
        }
        if (node.lewy == null && node.prawy == null){
            mapa.put(node.litera, kod);
            return;
        }
        tworzenieSlownika(node.lewy, mapa, kod+"0");
        tworzenieSlownika(node.prawy, mapa, kod+"1");
    }
}

