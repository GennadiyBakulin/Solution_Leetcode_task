package medium.add_two_numbers;

///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode listNode = new ListNode();
    ListNode tmp = listNode;

    int sum = l1.val + l2.val;
    int digit = 0;

    if (sum >= 10) {
      digit = 1;
      sum %= 10;
    }
    tmp.val = sum;

    while (l1.next != null || l2.next != null) {
      if (l1.next == null) {
        l1.val = 0;
      } else {
        l1 = l1.next;
      }
      if (l2.next == null) {
        l2.val = 0;
      } else {
        l2 = l2.next;
      }
      sum = l1.val + l2.val + digit;
      if (sum >= 10) {
        digit = 1;
        sum %= 10;
      } else {
        digit = 0;
      }

      tmp.next = new ListNode(sum);
      tmp = tmp.next;
    }

    if (digit == 1) {
      tmp.next = new ListNode(1);
    }

    return listNode;
  }

}
