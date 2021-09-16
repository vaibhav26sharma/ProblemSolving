package org.problemsolving.linkedlist;

/** Problem link - https://leetcode.com/problems/middle-of-the-linked-list/ */
public class MiddleOfLinkedlist {

  // My First self solution
  public ListNode middleNode(ListNode head) {
    // Naive solution, that came first into my mind
    if (head == null) return null;

    int lengthList = 0;
    ListNode temp = head;

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

  /**
   * think of a scenario where you have a field 200m long and there are two people, A is running
   * with 1x speed and B is running with 2x, so at any given point A will be at half of what B has
   * reached.
   *
   * <p>Say both starts at 0m, when Person B reaches 50m then Person A will be at 25m. When Person B
   * reaches 100m then Person A will be at 50m.
   *
   * <p>After sometime If Person B reaches 200m then Person A will be at 100m.
   *
   * <p>Hence Person A is at the mid of the field, when B reaches the end.
   *
   * @param head
   * @return
   */
  public ListNode middleNodeTwoPointerApproach(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    // Loop will stop at last 2nd element, since
    // checking fast.next!=null
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}
