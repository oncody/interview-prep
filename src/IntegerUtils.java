public class IntegerUtils {
  public static String toBinary(int number) {
    String binary = "";

    while(number > 0) {
      int lastBit = number % 2;
      number /= 2;
      binary = "" + lastBit + binary;
    }

    return binary;
  }

  public static int fromBinary(String binary) {
    int number = 0;

    int currentDigitWeight = 1;
    for(int i = binary.length() - 1; i >= 0; i--) {
      if(binary.charAt(i) == '1') {
        number += currentDigitWeight;
      }
      currentDigitWeight *= 2;
    }

    return number;
  }

  public static int reverse(int number) {
    int reversed = 0;

    while(number > 0) {
      int lastDigit = number % 10;
      number /= 10;
      reversed *= 10;
      reversed += lastDigit;
    }

    return reversed;
  }
}
