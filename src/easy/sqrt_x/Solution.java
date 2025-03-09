package easy.sqrt_x;

public class Solution {

  public static void main(String[] args) {
    System.out.println(mySqrt(2147395600));
  }

  public static int mySqrt(int x) {
    long number = 1;
    while (number * number <= x) {
      number++;
    }
    return (int)--number;
  }

}
