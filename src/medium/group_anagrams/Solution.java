package medium.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    String[] strList = new String[]{""};
    System.out.println(groupAnagrams(strList));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> hashMap = new HashMap<>();
    for (String str : strs) {
      char[] elem = str.toCharArray();
      Arrays.sort(elem);
      hashMap.computeIfAbsent(Arrays.toString(elem), (v) -> new ArrayList<>()).add(str);
    }
    return hashMap.values().stream().toList();
  }
}
