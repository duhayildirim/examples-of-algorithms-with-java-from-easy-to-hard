package Hard;

import java.util.HashMap;
import java.util.Map;

public class CounterCharMapList {
    public static void main(String[] args) {
        counterChar("Coca Cola");
    }

    public static void counterChar(String word) {
        String value = word.toLowerCase();
        Map<Character, Integer> list = new HashMap<Character, Integer>();
        int counter = 0;
        for (int i = 0; i < value.length(); i++) {
            for (int j = 0; j < value.length(); j++) {
                if (value.charAt(i) == value.charAt(j)) {
                    counter++;
                }
            }
            if (counter > 1 && !list.containsKey(value.charAt(i))) {
                list.put(value.charAt(i), counter);
            }
            counter = 0;
        }

        list.forEach((name, count) -> {
            System.out.println(name + " adet" + count);
        });
    }
}