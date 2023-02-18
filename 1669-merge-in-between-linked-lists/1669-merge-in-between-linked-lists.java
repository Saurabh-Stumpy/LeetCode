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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        
        while(curr!=null && a>1){
            a--;
            b--;
            curr=curr.next;
        }
        ListNode next = curr.next;
        b--;
        ListNode curr2 = list2;
        curr.next = list2;
        
        while(curr2.next!=null){
            curr2=curr2.next;
        }
        while(next!=null && b>=0){
            b--;
            next = next.next;
        }
        curr2.next = next;
        
        
        return list1;
        
    }
}