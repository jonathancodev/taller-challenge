import java.util.HashSet;
import java.util.Set;

public class challenge {
    public static void main(String[] args) {
        String text = "GEEKSFORGEEKS";
        int length = text.length();
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for (int i=0; i<length; i++) {
            char c = text.charAt(i);
            if (!set.contains(c)){
                set.add(c);
            } else {
                maxLen = Math.max(maxLen, set.size());
                set.clear();
            }
        }

        System.out.println(maxLen);

    }
}
