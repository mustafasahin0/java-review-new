import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sergiu");
        map.put(2, "Moses");
        System.out.println(map.get(2));

        System.out.println(findFirstNonRepeating("deo java developer"));
    }

    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        // for counting the chars
        int count;
        // counting chars and putting values in the hashMap
        for(Character eachCharacter : str.toCharArray()) {
            if(map.containsKey(eachCharacter)) {
                count = map.get(eachCharacter);
                map.put(eachCharacter, count+1);
            } else {
                map.put(eachCharacter, 1);
            }
        }
        // Starting from string, checking if the char count equals 1
        for (Character eachCharacter : str.toCharArray()) {
            if(map.get(eachCharacter) == 1) return eachCharacter;
        }
        return null;
    }
}
