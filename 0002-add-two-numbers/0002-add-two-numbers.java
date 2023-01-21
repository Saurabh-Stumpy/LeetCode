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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode add = null;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int sum = 0;
        while (curr1!=null && curr2!=null){
            sum = curr1.val+curr2.val+sum;
            add = addEnd(sum%10,add);
            sum = sum/10;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        while (curr1!=null){
            sum+=curr1.val;
            add =addEnd(sum%10,add);
            sum = sum/10;
            curr1 = curr1.next;
        }
        while (curr2!=null){
            sum+=curr2.val;
            add =addEnd(sum%10,add);
            sum = sum/10;
            curr2 = curr2.next;
        }
        if(sum!=0){
            add = addEnd(sum,add);
        }

        return add;
    }
    public static ListNode addEnd(int a,ListNode start){
        if(start == null){
            ListNode first = new ListNode(a);
            return  first;
        }
        ListNode curr = start;
        while (curr.next!=null){
            curr = curr.next;
        }
        ListNode add = new ListNode(a);
        curr.next = add;
        return start;
    }
}