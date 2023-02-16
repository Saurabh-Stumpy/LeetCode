/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0,count2 =0;
        ListNode curr = headA;
        
        while(curr!=null){
            count1++;
            curr=curr.next;
        }
        curr = headB;
        while(curr!=null){
            count2++;
            curr=curr.next;
        }
        
        int diff=Math.abs(count1-count2);
        
        System.out.println(diff);
        if(count1>count2){
            while(diff>0){
                diff--;
                headA = headA.next;
            }
        }
        else{
            while(diff>0){
                diff--;
                headB = headB.next;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        
        return headA;
        
    }
}