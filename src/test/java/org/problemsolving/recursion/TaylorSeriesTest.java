package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class TaylorSeriesTest {

  private final TaylorSeries taylorSeries = new TaylorSeries();
  DecimalFormat df = new DecimalFormat("#.##");

  @Test
  void e() {
    df.setRoundingMode(RoundingMode.FLOOR);
    assertEquals(54.59, Double.parseDouble(df.format(taylorSeries.e(4, 15))));
  }
}
