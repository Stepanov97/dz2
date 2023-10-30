import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "паттерны проектирования";
        System.out.println(checkItOut(str));
    }
    public static Map<Character, Integer> checkItOut(String s) {
        Map<Character, Integer> lit = new TreeMap<>();
        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != ' ') {
                char k = letters[i];
                int v = 1;
                if (lit.containsKey(k)) {
                    lit.put(k, lit.get(k) + 1);
                } else {
                    lit.put(k, v);
                }
            }
        }
        return lit;
    }
}