package easy.longest_common_prefix;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
  }

  public static String longestCommonPrefix(String[] strs) {
    StringBuilder result = new StringBuilder();

    Arrays.sort(strs);
    for (int i = 0; i < strs[0].length(); i++) {
      Character ch = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].charAt(i) != ch) {
          return result.toString();
        }
      }
      result.append(ch);
    }
    return result.toString();
  }
}
