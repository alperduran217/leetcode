package com.education.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        boolean test4 = isValid(")(){}");
        boolean test3 = isValid("]");
        boolean test2 = isValid("{[]}");
        boolean test1 = isValid("()");
        boolean test0 = isValid("([)");
    }

    public static boolean isValid(String s) {
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');
        if (s.length() < 2) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty()) {
                if (map.get(stack.peek()) == s.charAt(i)) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static Stack<Character> stack = new Stack<>();

    static Map<Character, Character> map = new HashMap<>();


}