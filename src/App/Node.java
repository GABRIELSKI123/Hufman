package App;

public class Node implements Comparable<Node>{
    public int czestotliwosc;
    public Character litera;

    public Node prawy;
    public Node lewy;
    public Node (Character litera, int czestotliwosc, Node prawy, Node lewy){
        this.czestotliwosc = czestotliwosc;
        this.litera = litera;
        this.prawy = prawy;
        this.lewy = lewy;
    }

    @Override
    public int compareTo(Node node){
        return Integer.compare(this.czestotliwosc, node.czestotliwosc);
    }
    @Override
    public String toString() {
            return "Znak:" + this.litera + " czestotliwosc: " + this.czestotliwosc;
    }
//    public void wypiszDrzewo(){
//        wypiszDrzewo()
//        }
}
