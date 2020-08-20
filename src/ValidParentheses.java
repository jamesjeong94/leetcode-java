import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (String ch: s.split("")) {
            if (ch.equals("(")) {
                stack.push(")");
            }
            if (ch.equals("{")) {
                stack.push("}");
            }
            if (ch.equals("[")) {
                stack.push("]");
            }
            if (ch.matches("\\)|}|\\]")) {
                String compare = stack.pop();
                if (compare != ch || stack.isEmpty()) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
