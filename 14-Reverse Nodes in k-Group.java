/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 5000
0 <= Node.val <= 1000

*/

//CODE
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp  = temp.next;
            n++;
        }
        ListNode ddfd = new ListNode(3423);
        ddfd.next = head;
        ListNode firstNode = ddfd;
        ListNode tempNode = head;
        int ptr = 1;
        int kptr = 1;
        ListNode cur = head;
        ListNode prev = null;
        if(k == 1) return ddfd.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
           // tempNode.next = null;
            if(kptr == k){
                firstNode.next = prev;
                firstNode = tempNode;
                firstNode.next = null;
                tempNode = cur;
                kptr = 0;
                if(ptr + k > n ){
                    firstNode.next = cur;
                    //System.out.println("breaked " + ptr + " " + firstNode.val);
                    return ddfd.next;
                }
            }
            
            ptr++;
            kptr++;
        }
        return ddfd.next;
    }
    
}
