package base;

import base.UniqueRandomNumberGenerator;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueRandomNumberGeneratorTest {
  @Test
  public void getXUniqueRandomInts() {
    int size = 100000;
    UniqueRandomNumberGenerator rng = new UniqueRandomNumberGenerator(new Random());
    Set<Integer> randomInts = rng.getXUniqueRandomInts(Integer.MAX_VALUE, size);
    assertEquals(size, randomInts.size());
  }
}
