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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        int l = 0;
        ListNode count = head;
        
        while(count!=null){
            l++;
            count=count.next;
        }
        //System.out.println(l);
        k=k%l;
        while(k!=0){
            ListNode curr = head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next.next = head;
            head = curr.next;
            curr.next = null;
            k--;
        }
        return head;
    }
}