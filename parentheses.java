import java.util.Stack;

class parentheses {
    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) 
                    return false;
                
                char top = stack.pop();
                if((c == ')' && top != '(')||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;   
                    }
                
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        System.out.println(isValid(test1)); // true
        System.out.println(isValid(test2)); // true
        System.out.println(isValid(test3)); // false
    }
}