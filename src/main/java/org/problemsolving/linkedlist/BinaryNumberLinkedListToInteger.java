package org.problemsolving.linkedlist;

/**
 * Problem link - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class BinaryNumberLinkedListToInteger {
  public static class ListNode {
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

  // Binary to Decimal Conversion Using Doubling Method

  /**
   * Doubling Method ---------------- Step 1: Start from the left-most bit , Double the previous
   * number and add the current digit. For LMB, the previous bit will be zero. Eg: ( 101101 )-> the
   * left-most digit is '1'. The double of the previous number is 0. Therefore, we get ((0 × 2) + 1)
   * which is 1.
   *
   * <p>Step 2: Now, double the previous digit and add it with the current digit. we get, [(1 × 2) +
   * 0], which is 2
   *
   * <p>Step 3: [(2 x 2) + 1] .... ....
   *
   * @param head
   * @return
   */
  public int getDecimalValue_DoublingMethod(ListNode head) {
    int previousBit = 0;
    while (head != null) {
      previousBit = ((previousBit * 2) + head.val);
      head = head.next;
    }
    return previousBit;
  }

  // My Own Solution
  public int getDecimalValue(ListNode head) {
    int sum = 0;
    int i = 0;

    // First reverse the linkedlist, since in binary conversion
    // starts from rightmost bit i.e. rightmost bit is 2^0
    ListNode previousElement = null;
    ListNode currentElement = head;

    while (currentElement != null) {
      ListNode nextElement = currentElement.next;
      currentElement.next = previousElement;
      previousElement = currentElement;
      currentElement = nextElement;
    }

    ListNode temp = previousElement;

    // Binary to Decimal Conversion Using Positional Notation Method
    while (temp != null) {
      sum += Math.pow(2, i) * temp.val;
      temp = temp.next;
      i++;
    }
    return sum;
  }

  public static void main(String[] args) {
    BinaryNumberLinkedListToInteger binaryNumberLinkedListToInteger =
        new BinaryNumberLinkedListToInteger();
    ListNode listNode =
        new ListNode(
            1,
            new ListNode(
                0,
                new ListNode(
                    0,
                    new ListNode(
                        1,
                        new ListNode(
                            0,
                            new ListNode(
                                0,
                                new ListNode(
                                    1,
                                    new ListNode(
                                        1,
                                        new ListNode(
                                            1,
                                            new ListNode(
                                                0,
                                                new ListNode(
                                                    0,
                                                    new ListNode(
                                                        0,
                                                        new ListNode(
                                                            0,
                                                            new ListNode(
                                                                0, new ListNode(0)))))))))))))));
    System.out.println(binaryNumberLinkedListToInteger.getDecimalValue_DoublingMethod(listNode));
  }
}
