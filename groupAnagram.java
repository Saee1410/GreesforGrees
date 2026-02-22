import java.util.*;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            // Building the unique key
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++){
                sb.append("#");
                sb.append(count[i]);
            }
            String key = sb.toString();

            // FIXED: Ensure the list exists before adding 's'
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        groupAnagram ga = new groupAnagram();
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println("Grouped Anagrams: " + result);
    }
}