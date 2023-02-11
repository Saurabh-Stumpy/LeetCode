/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode temp = new ListNode();
        ListNode curr = head;
        ListNode next = head.next;
        
        while(curr.next!=null){
            next = curr.next;
            if(curr.next == temp) return true;
            curr.next = temp;
            curr=next;
        }
        return false;
    }
}