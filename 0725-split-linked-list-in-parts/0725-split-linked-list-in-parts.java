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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        ListNode[] arr = new ListNode[k];
        if(head==null) return arr;
        
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        
        int rem = count%k;
        int div = count/k;
        
        curr = head;
        ListNode prev = null;
        
        int i = 0;
        arr[i] = curr;
        
        while(curr!=null){
            int tot = div;
            if(rem>0){
                rem--;
                tot++;
            }
            while(curr!=null&&tot>0){
                prev = curr;
                curr = curr.next;
                tot--;
            }
            prev.next=null;
            i++;
            if(i<arr.length){
                arr[i]=curr;
                prev = curr;
            }
        }
    
        return arr;
    }
}