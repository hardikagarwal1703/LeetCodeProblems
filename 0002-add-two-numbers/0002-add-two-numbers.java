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
        int carry = 0;
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;

        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            currentNode.next = node;
            currentNode = currentNode.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int sum = l1.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            currentNode.next = node;
            currentNode = node;

            l1 = l1.next;
        }

        while(l2 != null){
            int sum = l2.val + carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            currentNode.next = node;
            currentNode = node;

            l2 = l2.next;
        }

        if(carry > 0){
            ListNode node = new ListNode(carry);
            currentNode.next = node;
            
        }
        return dummyNode.next;
    }
}