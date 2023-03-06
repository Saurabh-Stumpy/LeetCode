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
    public ListNode partition(ListNode head, int x) {
        ListNode start = new ListNode(0);
        ListNode low = start;
        ListNode mid = new ListNode(0);
        ListNode high = mid;
        ListNode curr = head;
        
        while(curr!=null){
             if(curr.val<x){
                 low.next = curr;
                 low = curr;
             }
            else{
                high.next = curr;
                high = curr;
            }
            curr=curr.next;
        }
        low.next=mid.next;
        high.next=null;
        return start.next;
        
    }
}