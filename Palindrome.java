public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }else {
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
            }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = palindrome.isPalindrome(s);    
        System.out.println(result); // Output: true
    }
}
