import java.util.Stack;

public class Q25 {
    public static void main(String[] args) {
        // Valid Parenthesis
        String st = "()[]{}";
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    System.out.println("Invalid");
                    break;
                }
                if (ch == ')' && s.peek() != '('
                        || ch == '}' && s.peek() != '{'
                        || ch == ']' && s.peek() != '[') {
                    System.out.println("Invalid");
                    break;
                } else {
                    s.pop();
                }
            }
        }
        if (s.isEmpty()) {
            System.out.println("Valid");
        }
    }
}
