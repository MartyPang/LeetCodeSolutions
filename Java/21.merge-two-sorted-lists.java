import javax.lang.model.util.ElementScanner6;
import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (45.88%)
 * Total Accepted:    516.7K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                tmp.next = l2;
                l2 = l2.next;
                tmp = tmp.next;
            }
            else if(l2 == null) {
                tmp.next = l1;
                l1 = l1.next;
                tmp = tmp.next;
            }
            //p1 != null && p2 != null
            else {
                if(l1.val <= l2.val) {
                    tmp.next = l1;
                    l1 = l1.next;
                    tmp = tmp.next;
                }
                else {
                    tmp.next = l2;
                    l2 = l2.next;
                    tmp = tmp.next;
                }
            }
        }
        return head.next;
    }
}

