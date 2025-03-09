package easy.happy_number;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public static void main(String[] args) {
    System.out.println(isHappy(2));
  }

  public static boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();
    while (true) {
      if (n == 1) {
        return true;
      }
      int sum = 0;
      while (n != 0) {
        sum = sum + (n % 10) * (n % 10);
        n /= 10;
      }
      if (set.contains(sum)) {
        return false;
      }
      n = sum;
      set.add(n);
    }
  }
}
