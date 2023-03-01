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
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode curr = head.next;
        ListNode prev = head;
        int sum = 0;
        while(curr!=null){
            if(curr.val!=0){
                sum = sum + curr.val;
            }
            else{
                ListNode demo = new ListNode(sum);
                demo.next = curr;
                prev.next = demo;
                prev = prev.next;
                sum = 0;
            }
            curr = curr.next;
        }
        prev.next = null;
        
        
        
        return head.next;
    }
}