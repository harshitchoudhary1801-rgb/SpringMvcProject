import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeated: " + entry.getKey());
                break;
            }
        }
    }
}