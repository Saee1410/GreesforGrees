import java.util.ArrayList;
import java.util.HashSet;   
import java.util.List;
import java.util.Set;

public class paranthesis {
    Set<String> validStrings = new HashSet<>();

    public List<String> removeInvalidParentheses(String s){
        int leftRem = 0, rightRem = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(') {
                leftRem++;
            } else if(c == ')'){
                if(leftRem > 0 ) leftRem--;
                else rightRem++;
            }
        }

        //backtrack
        backtrack(s, 0, leftRem, rightRem);
        return new ArrayList<>(validStrings);
    }

    private void backtrack(String s, int index, int leftRem, int rightRem){
        //base case
        if(leftRem == 0 && rightRem == 0){
            if(isValid(s)){
                validStrings.add(s);
            }
            return;
        }

        for(int i = index; i< s.length(); i++){
            if(i > index && s.charAt(i) == s.charAt(i - 1)) continue;

            char c = s.charAt(i);

            if(rightRem > 0 && c == ')'){
                String nextStr = s.substring(0, i) + s.substring(i + 1);
                backtrack(nextStr, i, leftRem, rightRem - 1);
            }  else if(leftRem > 0 && c == '('){
                String nextStr = s.substring(0, i) + s.substring(i + 1);
                backtrack(nextStr, i, leftRem - 1, rightRem);
            }
        }
    }

    private boolean isValid(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(') count++;
            else if(c == ')') count--;
        }
        return count == 0;

    }
    public static void main(String[] args) {
        paranthesis p = new paranthesis();
        String s = "()())()";
        List<String> result = p.removeInvalidParentheses(s);
        System.out.println(result);
    }
}
