package org.problemsolving.linkedlist;

/** Problem link - https://leetcode.com/problems/middle-of-the-linked-list/ */
public class MiddleOfLinkedlist {
  public static class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {}

    ListNode1(int val) {
      this.val = val;
    }

    ListNode1(int val, ListNode1 next) {
      this.val = val;
      this.next = next;
    }
  }

  // My First self solution
  public ListNode1 middleNode(ListNode1 head) {
    // Naive solution, that came first into my mind
    if (head == null) return null;

    int lengthList = 0;
    ListNode1 temp = head;

    while (temp != null) {
      lengthList++;
      temp = temp.next;
    }

    int middlePosition = (lengthList / 2);
    int i = 0;

    while (head != null) {
      if (i == middlePosition) {
        break;
      }
      head = head.next;
      i++;
    }

    return head;
  }
}
