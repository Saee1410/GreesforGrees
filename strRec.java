public class strRec {
    public static String reverseString(String str) {
       // String str[]= "abcde";
        int n = str.length();
        String rev = "";

        if (n == 0){
            return rev;
        }
        for (int i = n - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;

    //     StringBuilder sb = new StringBuilder();
    // for (int i = str.length() - 1; i >= 0; i--) {
    //     sb.append(str.charAt(i)); // He O(1) madhe hota
    // }
    // return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("abcde"));
        String str = "abcde";
        reverseString(str);
    }
}
