package easy.two_sum;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    System.out.print(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
  }

  public static int[] twoSum(int[] nums, int target) {
    int index1 = 0;
    int index2 = 0;
    a:
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] > target) {
        continue;
      }
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] > target) {
          continue;
        }
        if (nums[i] + nums[j] == target) {
          index1 = i;
          index2 = j;
          break a;
        }
      }
    }
    return new int[]{index1, index2};
  }
}