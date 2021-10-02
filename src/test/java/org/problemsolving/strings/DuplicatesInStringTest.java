package org.problemsolving.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInStringTest {
  private final DuplicatesInString duplicatesInString = new DuplicatesInString();
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @BeforeEach
  void setup() {
    // Whatever application writes to the console (using System.out.printX()),
    // instead get written to the outputStream you pass
    System.setOut(new PrintStream(outContent));
  }

  @Test
  void printDuplicates() {
    // Uses \n since needs a new line as we are using println in our method
    String expectedOutput = "a,count= 2\nb,count= 2\n";
    duplicatesInString.printDuplicates("ababcd");
    assertEquals(expectedOutput, outContent.toString());
  }
}
