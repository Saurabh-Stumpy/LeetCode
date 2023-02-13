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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            arr.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        //System.out.println(slow.num);
        //System.out.println(arr);
        if(fast!=null) {
            slow = slow.next;
        }
        int i = arr.size()-1;
        while (slow!=null && i>=0){
            if(slow.val!=arr.get(i)) return  false;
            slow=slow.next;
            i--;
        }

        return true;
    }
}