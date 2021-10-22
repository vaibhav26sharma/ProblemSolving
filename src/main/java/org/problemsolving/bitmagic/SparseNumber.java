package org.problemsolving.bitmagic;

public class SparseNumber {
  public boolean isSparse(int n) {
    // This is same as n AND 2n( left shift is same as multiplying by 2)
    // n & 2n == 0 is number is sparse
    return (n & (n << 1)) == 0;
  }
}
