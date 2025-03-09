package easy.remove_duplicates_from_sorted_array;

public class Solution {

  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1,1,2}));
  }

  public static int removeDuplicates(int[] nums) {

    int k = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i]!= nums[i-1]){
        nums[k] = nums[i];
        k++;
      }
    }

    return k;
  }
}
