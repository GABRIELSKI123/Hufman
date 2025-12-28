package App;

import java.util.HashMap;
import java.util.Map;

public class Zliczanie {
    public static Map<Character, Integer> zliczanie(String tekst){
        Map <Character, Integer> mapa3 = new HashMap<>();
        for (char c: tekst.toCharArray()){
            if (mapa3.containsKey(c)){
                mapa3.put(c, mapa3.get(c)+1);
            }
            else{
                mapa3.put(c, 1);
            }
        }
        return mapa3;

    }
}
