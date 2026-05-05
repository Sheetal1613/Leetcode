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
// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {
        
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len = 1;
        ListNode tail = head;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        
        k = k%len;
        tail.next = head;
        
        ListNode tail_new = head;
        for(int i=1; i<len-k; i++){
            tail_new = tail_new.next;
        }

        head=tail_new.next;
        tail_new.next = null;
        return head;
    }
}