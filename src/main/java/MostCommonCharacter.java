import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        if(str==null || str.length()<1) {
            return ' ';
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            Character key = str.charAt(i);
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key)+1);
            }
        }
        Character commonKey = str.charAt(0);
        int count = map.get(commonKey);
        for(Character ch : map.keySet()) {
            if(map.get(ch) > count) {
                count = map.get(ch);
                commonKey = ch;
            }
        }

        return commonKey;
    }
}
