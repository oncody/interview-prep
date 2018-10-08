import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
  @Test
  void allUniqueCharactersTrue() {
    assertTrue(StringUtils.allUniqueCharacters("abc"));
  }
  @Test
  void allUniqueCharactersFalse() {
    assertFalse(StringUtils.allUniqueCharacters("abca"));
  }
  @Test
  void allUniqueCharactersNaiveTrue() {
    assertTrue(StringUtils.allUniqueCharactersNaive("abc"));
  }
  @Test
  void allUniqueCharactersNaiveFalse() {
    assertFalse(StringUtils.allUniqueCharactersNaive("abca"));
  }
  @Test
  void areAnagramsTrue() {
    assertTrue(StringUtils.areAnagrams("abccba", "aabbcc"));
  }
  @Test
  void areAnagramsFalse() {
    assertFalse(StringUtils.areAnagrams("abccba", "aabbc"));
  }
  @Test
  void reverseStringHappyPath() {
    assertEquals("edcba", StringUtils.reverseString("abcde"));
  }
}
