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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) return head;
        if(right==left) return head;
        
        ListNode demo = new ListNode(0);
        demo.next = head;
        ListNode curr = head;
        ListNode prev = demo;
        
        int count = 1;
        
        while(count!=left){
            prev=curr;
            curr=curr.next;
            count++;
        }
        ListNode end = curr;
        ListNode last = curr;
        ListNode start = curr.next;
        
        while(count<right-1){
            count++;
            ListNode next = start.next;
            start.next = last;
            last = start;
            start = next;
        }
        end.next = start.next;
        start.next = last;
        prev.next = start;
        
       return demo.next; 
    }
}