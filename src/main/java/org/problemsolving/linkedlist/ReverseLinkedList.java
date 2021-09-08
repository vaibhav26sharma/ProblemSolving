package org.problemsolving.linkedlist;

/**
 * Problem Link - https://leetcode.com/problems/reverse-linked-list/
 *
 * Algorithm
 * 1. Take a copy of current head's next element
 * 2. Change current head's next pointer to what its previous element pointer was since we are reversing the prev will now become next. For head element, prev will be null
 * 3. Now the current head will become the previous pointer for its next element which we took backup of in step 1
 * 4. Current head's next will now becomes the current head or the current element
 * Previous element of current head will become its next element instead since we are reversing
 */
public class ReverseLinkedList {

    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //CurrentElement can also be regarded as head
    public ListNode reverseList(ListNode currentElement) {
        if(currentElement == null)
            return new ListNode();

        ListNode previousElement = null;

        while( currentElement != null) {
            ListNode nextElement = currentElement.next;
            currentElement.next = previousElement;//moving currentElement's previous pointer to its next pointer
            previousElement = currentElement;//making currentElement or currentHead as previous for nextElement
            currentElement = nextElement;//Changing head or the current element to next of previousElement or previous head
        }
        return previousElement;
    }

    public ListNode reverseListRecursive(ListNode currentElement) {
        return reverseListRecursive(currentElement, null);
    }

    public ListNode reverseListRecursive(ListNode currentElement, ListNode previousElement) {
        if(currentElement == null)
            return previousElement;

        ListNode nextElement = currentElement.next;
        currentElement.next = previousElement;
        return reverseListRecursive(nextElement, currentElement);

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedList reverse = new ReverseLinkedList();
        ListNode newNode = reverse.reverseList(node);
        System.out.println(newNode.val +" "+ newNode.next.val+" "+newNode.next.next.val);

        ListNode node2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        ListNode newNode1 = reverse.reverseListRecursive(node2);
        System.out.println(newNode1.val +" "+ newNode1.next.val+" "+newNode1.next.next.val);
    }
}
