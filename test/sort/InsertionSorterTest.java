package sort;

import base.UniqueRandomNumberGenerator;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSorterTest {
  @Test
  void sort() {
    UniqueRandomNumberGenerator rng = new UniqueRandomNumberGenerator(new Random());
    Collection<Integer> randomInts = rng.getXUniqueRandomInts(100, 10);
    List<Integer> sortedInts = InsertionSorter.sort(randomInts);
    List<Integer> wellSortedInts = sortedInts.stream().sorted().collect(Collectors.toList());
    assertEquals(wellSortedInts, sortedInts);
  }
}
