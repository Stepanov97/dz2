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
            if (!lit.containsKey(letters[i]) && letters[i] != ' ') {
                char k = letters[i];
                int v = 1;
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i] == letters[j]) {
                        v++;
                    }
                    lit.put(k, v);
                }
            }
        }
        return lit;
    }
}