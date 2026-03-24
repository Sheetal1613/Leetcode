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
            PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b)-> a.val-b.val);
           ListNode res = new ListNode(-1);
            ListNode temp = res;
            for(int i=0; i<lists.length; i++){
                ListNode node = lists[i];
               
                while(node!=null){
                    pq.add(node);
                    node = node.next;
                }
            }
            while(!pq.isEmpty()){
                
                temp.next = pq.remove();
                temp = temp.next;
                temp.next = null;
            
            }
            return res.next;
    }
}