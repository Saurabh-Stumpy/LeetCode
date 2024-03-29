/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode prev = null;
        ListNode fast = head;
        ListNode next = null;
        int max = Integer.MIN_VALUE ;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if(fast!=null) slow=slow.next;

        while (slow!=null){
            max = Math.max(max,slow.val+prev.val);
            slow=slow.next;
            prev=prev.next;
        }
        return max;
    }
}