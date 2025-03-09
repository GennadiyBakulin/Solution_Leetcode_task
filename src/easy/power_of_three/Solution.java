package easy.power_of_three;

public class Solution {

  public static void main(String[] args) {
    System.out.println(isPowerOfThree(2069870691));
  }

  public static boolean isPowerOfThree(int n) {
    if (n <= 0) {
      return false;
    }
    while (n % 3 == 0) {
      n = n / 3;
    }
    return n == 1;
  }
}
