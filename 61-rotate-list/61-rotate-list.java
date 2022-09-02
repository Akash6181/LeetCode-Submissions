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
        if(head==null || head.next==null) return head;
        ListNode cur=head;
        int n=1;
        while(cur.next!=null){
            cur=cur.next;
            n++;
        }
        k=k%n;
        cur.next=head;
        ListNode temp=head;
        n-=k;
        while(n>1){
            temp=temp.next;
            n--;
        }  
        cur=temp.next;
        temp.next=null;
        return cur;
    }
}