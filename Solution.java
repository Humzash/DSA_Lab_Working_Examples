package com.mycompany.test;


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        
        Solution solution = new Solution();
        System.out.println(solution.hasCycle(head));
        
        node3.next = null;
        System.out.println(solution.hasCycle(head));
    }
}
