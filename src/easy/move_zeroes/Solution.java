package easy.move_zeroes;

import java.util.Arrays;

public class Solution {

  public static void main(String[] args) {
    moveZeroes(new int[]{0, 1, 0, 3, 12});
  }

  public static void moveZeroes(int[] nums) {
    int number = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[number] = nums[i];
        number++;
      }
    }
    for (int i = number; i < nums.length; i++) {
      nums[i] = 0;
    }
    System.out.println(Arrays.toString(nums));

  }
}
