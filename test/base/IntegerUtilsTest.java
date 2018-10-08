package base;

import base.IntegerUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerUtilsTest {
  @Test
  void reverseHappyPath() {
    assertEquals(54321, IntegerUtils.reverse(12345));
  }
  @Test
  void reverseHappyPath2() {
    assertEquals(1, IntegerUtils.reverse(10));
  }
  @Test
  void reverseHappyPath3() {
    assertEquals(11, IntegerUtils.reverse(11));
  }
  @Test
  void toBinary() {
    assertEquals("10101010", IntegerUtils.toBinary(170));
  }
  @Test
  void toBinary2() {
    assertEquals("11111111", IntegerUtils.toBinary(255));
  }
  @Test
  void toBinary3() {
    assertEquals("11111110", IntegerUtils.toBinary(254));
  }
  @Test
  void fromBinary() {
    assertEquals(170, IntegerUtils.fromBinary("10101010"));
  }
  @Test
  void fromBinary2() {
    assertEquals(255, IntegerUtils.fromBinary("11111111"));
  }
  @Test
  void fromBinary3() {
    assertEquals(254, IntegerUtils.fromBinary("11111110"));
  }
}
