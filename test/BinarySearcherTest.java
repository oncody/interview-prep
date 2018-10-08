import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearcherTest {
  UniqueRandomNumberGenerator rng = new UniqueRandomNumberGenerator(new Random());

  @Test
  void size3FirstElement() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(10, 3);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    BinarySearchMetadata metadata = binarySearcher.search();
    assertEquals(2, metadata.getMaxIterations());
    assertEquals(2, metadata.getIterations());
    assertEquals(0, metadata.getIndex());
    assertTrue(metadata.isFound());
  }

  @Test
  void size3MiddleElement() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(10, 3);
    Integer target = sortedInts.get(1);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    BinarySearchMetadata metadata = binarySearcher.search();
    assertEquals(2, metadata.getMaxIterations());
    assertEquals(1, metadata.getIterations());
    assertEquals(1, metadata.getIndex());
    assertTrue(metadata.isFound());
  }

  @Test
  void size3LastElement() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(10, 3);
    Integer target = sortedInts.get(2);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    BinarySearchMetadata metadata = binarySearcher.search();
    assertEquals(2, metadata.getMaxIterations());
    assertEquals(2, metadata.getIterations());
    assertEquals(2, metadata.getIndex());
    assertTrue(metadata.isFound());
  }

  @Test
  void size3ElementNotFound() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(10, 3);
    Integer target = 11;
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    BinarySearchMetadata metadata = binarySearcher.search();
    assertEquals(2, metadata.getMaxIterations());
    assertEquals(2, metadata.getIterations());
    assertEquals(-1, metadata.getIndex());
    assertFalse(metadata.isFound());
  }

  @Test
  void size1Has1MaxIteration() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(10, 1);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(1, binarySearcher.calculateMaxIterations());
  }

  @Test
  void size2Has2MaxIterations() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(100, 2);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(2, binarySearcher.calculateMaxIterations());
  }

  @Test
  void size3Has2MaxIterations() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(100, 3);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(2, binarySearcher.calculateMaxIterations());
  }

  @Test
  void size4Has3MaxIterations() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(100, 4);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(3, binarySearcher.calculateMaxIterations());
  }

  @Test
  void size7Has3MaxIterations() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(100, 7);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(3, binarySearcher.calculateMaxIterations());
  }

  @Test
  void size8Has4MaxIterations() {
    List<Integer> sortedInts = getXSortedUniqueRandomInts(100, 8);
    Integer target = sortedInts.get(0);
    BinarySearcher<Integer> binarySearcher = new BinarySearcher<>(sortedInts, target);
    assertEquals(4, binarySearcher.calculateMaxIterations());
  }

  private List<Integer> getXSortedUniqueRandomInts(int range, int size) {
    Set<Integer> randomInts = rng.getXUniqueRandomInts(range, size);
    return randomInts.stream().sorted().collect(Collectors.toList());
  }
}
