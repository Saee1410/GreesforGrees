public class consecutive {
    public String removeConsecutiveCharacter(String s) {
        if(s == null || s.length() == 0) {
            return " ";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        consecutive consecutive = new consecutive();
        String s = "aaabbbcccaaa";
        String result = consecutive.removeConsecutiveCharacter(s);    
        System.out.println(result); // Output: abc
    }
}
