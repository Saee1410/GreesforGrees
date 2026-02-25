public class wildcart {
    public boolean match(String wild, String pattern){
       int w = 0, p = 0;
       int match = 0, starIdx = -1;

       while(p < pattern.length()){
        if(w < wild.length() && (wild.charAt(w) == '?' || wild.charAt(w) == pattern.charAt(p))){
            w++;
            p++;
        }else if(w < wild.length() && wild.charAt(w) == '*'){
            starIdx = w;
            match = p;
            w++;

        }
        else if(starIdx != -1){
            w = starIdx + 1;
            match++;
            p = match ;
        }
        else{
            return false;
        }
       }
       while(w < wild.length() && wild.charAt(w) == '*'){
        w++;
       }    
       return w == wild.length();
    }
    public static void main(String[] args) {
        wildcart wc = new wildcart();
        System.out.println(wc.match("a*b?c", "axyzbzc")); // Output: true
        System.out.println(wc.match("a*?c", "abcc"));     // Output: true
        System.out.println(wc.match("a*?c", "abc"));      // Output: false
    }
}
