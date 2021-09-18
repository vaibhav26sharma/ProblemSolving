package org.problemsolving.linkedlist;

/* Problem Link - https://leetcode.com/problems/intersection-of-two-linked-lists/ */

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListIntersection {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = length(headA);
    int lenB = length(headB);

    // if lenA > lenB, keep reducing lenA until they get equal or point to same location
    while (lenA > lenB) {
      headA = headA.next;
      lenA--;
    }

    // if lenB>lenA, keep reducing lenB until they get equal or point to same location
    while (lenB > lenA) {
      headB = headB.next;
      lenB--;
    }

    // Now when both lists pointer point at the same position start
    // comparing each element to find the intersection
    while (headA != headB) {
      headA = headA.next;
      headB = headB.next;
    }

    return headA;
  }

  private int length(ListNode node) {
    int length = 0;

    while (node != null) {
      node = node.next;
      length++;
    }
    return length;
  }
}
