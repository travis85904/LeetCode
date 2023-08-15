import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> values = new HashMap<>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);

        int current = 0;
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            current = values.get(String.valueOf(s.charAt(i)));

            if ((current == 1 || current == 10 || current == 100) && i + 1 < s.length()) {
                int next = values.get(String.valueOf(s.charAt(i + 1)));
                if ((next == 5 || next == 10) && current == 1) {
                    current = next - current;
                    i++;
                }
                if ((next == 50 || next == 100) && current == 10) {
                    current = next - current;
                    i++;
                }
                if ((next == 500 || next == 1000) && current == 100) {
                    current = next - current;
                    i++;
                }
            }
            total += current;
        }

        return total;
    }
}
