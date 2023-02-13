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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode prev = null;
        ListNode fast = head;
        ListNode next = null;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        if(fast!=null) slow=slow.next;

        while (slow!=null){
//            System.out.println(prev.num+" "+slow.num);
            if(slow.val!=prev.val) return false;
//            System.out.print(slow.num+" ");
            slow=slow.next;
            prev=prev.next;
        }
//        System.out.println();
//        while (prev!=null){
//            System.out.print(prev.num+" ");
//            prev=prev.next;
//        }
        return true;
    }
}