package easy.contains_duplicate;

import java.util.HashSet;

public class Solution {

  public static void main(String[] args) {
    System.out.println(containsDuplicate(1, 3, 4, 2));
  }

  public static boolean containsDuplicate(int... nums) {
    HashSet<Integer> set = new HashSet<>();
    for (Integer num : nums) {
      if (set.contains(num)) {
        return true;
      }
      set.add(num);
    }
    return false;
  }
}
