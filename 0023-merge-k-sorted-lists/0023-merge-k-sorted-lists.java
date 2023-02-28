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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length ==1) return lists[0];
        
        int count = lists.length;
        
        ListNode demo = new ListNode(0);
        ListNode curr = demo;
        
        while( count>0){
            int count2=0;
            int min = -1;
            for(int i=0;i<lists.length;i++){
                if(lists[i]==null) 
                {
                    count2++;
                    continue;
                }
                else{
                    if(min == -1) min = i;
                    else min = lists[min].val>lists[i].val?i:min;
                }
            }
            if(min>-1){
                System.out.println(lists[min].val + " "+ count);
                curr.next = lists[min];
                curr = curr.next;
                lists[min]=lists[min].next;
            }
            if(count==count2) break;
        }
        
        
        return demo.next;
    }
}