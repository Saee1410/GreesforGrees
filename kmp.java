public class kmp {
    int lps(String s){
        int n = s.length();
        if(n < 2) return 0;

        int[] lps = new int[n];
        int len = 0, i = 1;

        while( i< n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else {
                if(len != 0){
                    len = lps[len - 1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n-1];
    }
    public static void main(String[] args) {
        kmp k = new kmp();
        System.out.println(k.lps("ababc")); // Output: 2
        System.out.println(k.lps("aaaa"));  // Output: 3
        System.out.println(k.lps("abcde")); // Output: 0
    }
}
