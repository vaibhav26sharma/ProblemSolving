package org.problemsolving.linkedlist;

/* * Problem Link - https://leetcode.com/problems/reverse-linked-list/ */

public class RemoveListDuplicates {
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;

    ListNode tmp = head;

    while (tmp != null) {
      // If current element does not have a next element
      // to compare with, stop the iteration
      if (tmp.next == null) {
        break;
      }
      // If current and next nodes have same values,
      // remove next node by replacing it with its next node
      if (tmp.val == tmp.next.val) {
        tmp.next = tmp.next.next;
      } else {
        // else move on to next element in the list
        tmp = tmp.next;
      }
    }
    return head;
  }
}
