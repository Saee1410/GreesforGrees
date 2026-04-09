public class removeDuplicaterec {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        // 1. Base Case
        if (idx == str.length()) {
            System.out.println("Final String: " + newString);
            return;
        }

        char currChar = str.charAt(idx);

        // 2. Memory check (Logic)
        // 'a' - 'a' = 0, 'b' - 'a' = 1... ya ne apan index kadhto
        if (map[currChar - 'a'] == true) {
            // Jar character aadhi aala asel, tar fakt pudhe ja (Non-pick)
            removeDuplicates(str, idx + 1, newString);
        } else {
            // Jar pahilyanda aala asel, tar add kara ani map true kara (Pick)
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdd";
        removeDuplicates(str, 0, "");
    }
}
