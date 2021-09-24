package org.problemsolving.recursion;

import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class TaylorSeriesHornersRuleTest {
  private final TaylorSeriesHornersRule taylorSeriesHornersRule = new TaylorSeriesHornersRule();
  DecimalFormat df = new DecimalFormat("#.##");

  @Test
  void e() {
    df.setRoundingMode(RoundingMode.FLOOR);
    assertEquals(54.59, Double.parseDouble(df.format(taylorSeriesHornersRule.e(4, 15))));
  }
}
