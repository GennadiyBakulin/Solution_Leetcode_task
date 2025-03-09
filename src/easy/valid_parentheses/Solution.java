package easy.valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    System.out.println(isValid("}{"));
  }

  public static boolean isValid(String s) {
    Map<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put(')', '(');
    map.put('{', '}');
    map.put('}', '{');
    map.put('[', ']');
    map.put(']', '[');
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      if (!stack.isEmpty() && map.get(stack.peek()).equals(s.charAt(i))) {
        stack.pop();
      } else {
        stack.add(s.charAt(i));
      }
    }
    return stack.isEmpty();
  }
}
