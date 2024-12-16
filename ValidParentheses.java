import java.util.Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                // If closing bracket, check for matching opening bracket
                if (s.isEmpty()) {
                    return false; // Stack empty, no match
                }
                
                if ((s.peek()== '(' && ch == ')') || 
                    (s.peek()== '[' && ch == ']') || 
                    (s.peek()== '{' && ch == '}')) {

                    s.pop(); // Valid match, remove from stack
                } else {
                    return false; // Mismatch
                }
            }
        }

        // Check if all opening brackets are matched
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      // true
    }
}
