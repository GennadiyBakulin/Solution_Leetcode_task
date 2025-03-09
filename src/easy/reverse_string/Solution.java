package easy.reverse_string;

public class Solution {

  public static void main(String[] args) {
    reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
  }

  public static void reverseString(char[] s) {
    int l = s.length - 1;
    int mid = s.length / 2;
    for (int i = 0; i < mid; i++) {
      char tmp = s[i];
      s[i] = s[l - i];
      s[l - i] = tmp;
    }
    System.out.println(s);
  }
}
