import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringUtils {
  public static boolean allUniqueCharactersNaive(String input) {
    if (input == null) {
      throw new IllegalArgumentException("input was null");
    }
    for (int i = 0; i < input.length(); i++) {
      for (int j = i + 1; j < input.length(); j++) {
        if (input.charAt(i) == input.charAt(j)) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean allUniqueCharacters(String input) {
    if (input == null) {
      throw new IllegalArgumentException("input was null");
    }
    Set<Character> uniqueCharacters = new HashSet<>();
    for (char c : input.toCharArray()) {
      uniqueCharacters.add(c);
    }
    return input.length() == uniqueCharacters.size();
  }

  public static boolean areAnagrams(String first, String second) {
    if (first == null || second == null) {
      throw new IllegalArgumentException("input was null");
    }
    Map<Character, Integer> firstCharToFrequency = new HashMap<>();
    for (char c : first.toCharArray()) {
      firstCharToFrequency.merge(c, 1, (a, b) -> a + b);
    }
    Map<Character, Integer> secondCharToFrequency = new HashMap<>();
    for (char c : second.toCharArray()) {
      secondCharToFrequency.merge(c, 1, (a, b) -> a + b);
    }

    return firstCharToFrequency.equals(secondCharToFrequency);
  }

  public static String reverseString(String input) {
    if(input == null) {
      throw new IllegalArgumentException("input is null");
    }
    String reversed = "";
    for(int i = input.length() - 1; i >= 0; i--) {
      reversed += input.charAt(i);
    }

    return reversed;
  }
}
