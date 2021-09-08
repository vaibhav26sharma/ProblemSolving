package org.problemsolving.linkedlist;

import java.util.Stack;

/**
 * Problem link - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class BinaryNumberLinkedListToInteger {
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

    //Better performing than stack solution
    public int getDecimalValue(ListNode head) {
        int sum =0;
        int i=0;

        //First reverse the linkedlist, since in binary conversion
        //starts from rightmost bit i.e. rightmost bit is 2^0
        ListNode previousElement = null;
        ListNode currentElement = head;

        while(currentElement!=null) {
            ListNode nextElement = currentElement.next;
            currentElement.next = previousElement;
            previousElement = currentElement;
            currentElement = nextElement;
        }

        ListNode temp = previousElement;

        while(temp!=null) {
            sum += Math.pow(2,i) * temp.val;
            temp = temp.next;
            i++;
        }
        return sum;
    }

    public int getDecimalValueUsingStack(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null) {
            stack.push(head.val);
            head =  head.next;
        }
        int i =0;
        int sum =0;
        while(!stack.isEmpty()) {
            sum+= Math.pow(2,i) * stack.pop();
            i++;
        }
        return sum;
     }
  public static void main(String[] args) {
   BinaryNumberLinkedListToInteger binaryNumberLinkedListToInteger = new BinaryNumberLinkedListToInteger();
   ListNode listNode = new ListNode(1,new ListNode(0, new ListNode(0, new ListNode(1,new ListNode(0, new ListNode(0, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0)))))))))))))));
    System.out.println(binaryNumberLinkedListToInteger.getDecimalValueUsingStack(listNode));
  }
}
