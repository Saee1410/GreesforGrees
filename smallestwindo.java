import java.util.*;

public class smallestwindo {
    public static String minWindow(String s, String p) {
        if (s == null || p == null || s.length() < p.length()) {
            return "";
        }

        // Since the input is lowercase English letters, 
        // an array of size 26 or 128 is faster than a HashMap.
        int[] targetFreq = new int[128];
        for (char c : p.toCharArray()) {
            targetFreq[c]++;
        }

        int[] windowFreq = new int[128];
        int left = 0, right = 0;
        int count = 0; // Number of characters of p currently satisfied in window
        int minLen = Integer.MAX_VALUE;
        int startIndex = -1;

        while (right < s.length()) {
            char rChar = s.charAt(right);
            windowFreq[rChar]++;

            // If this character is needed and we haven't exceeded the required count
            if (targetFreq[rChar] > 0 && windowFreq[rChar] <= targetFreq[rChar]) {
                count++;
            }

            // When all characters of p are found in the current window
            while (count == p.length()) {
                // Update the minimum window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }

                // Try to shrink from the left
                char lChar = s.charAt(left);
                if (targetFreq[lChar] > 0 && windowFreq[lChar] == targetFreq[lChar]) {
                    count--;
                }
                windowFreq[lChar]--;
                left++;
            }
            right++;
        }

        return startIndex == -1 ? "" : s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("timetopractice", "toc")); // Output: "toprac"
        System.out.println(minWindow("zoomlazapzo", "oza"));    // Output: "apzo"
        System.out.println(minWindow("zoom", "zooe"));         // Output: ""
    }
}