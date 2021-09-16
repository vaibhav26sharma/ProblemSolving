package org.problemsolving.linkedlist;

/** Problem link - https://leetcode.com/problems/delete-node-in-a-linked-list/ */
public class DeleteNode {

  // Given node is the pointer of the node to be deleted
  // Node to be deleted will never be a tail node
  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
