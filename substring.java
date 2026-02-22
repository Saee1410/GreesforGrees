import java.util.HashSet;

public class substring {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxlen = 0;
        HashSet<Character> set = new HashSet<>();        //Traverse 
        
        while (right < s.length()){
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
            right++;
        }
        return maxlen;
    }
    public static void main(String[] args) {
        substring substring = new substring();
        String s = "abcabcdsea";
        int result = substring.lengthOfLongestSubstring(s);
        System.out.println(result); // Output: 3
    }
}
