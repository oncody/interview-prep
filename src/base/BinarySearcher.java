package base;

import java.util.List;

public class BinarySearcher<T extends Comparable<? super T>> {
  private final List<T> sortedList;
  private final T target;

  public BinarySearcher(List<T> sortedList, T target) {
    this.sortedList = sortedList;
    this.target = target;
  }

  public BinarySearchMetadata search() {
    int maxIterations = calculateMaxIterations();

    int iterations = 0;
    int min = 0;
    int max = sortedList.size() - 1;
    while (min <= max) {
      iterations++;
      int middle = (min + max) / 2;
      if(sortedList.get(middle).equals(target)) {
        return new BinarySearchMetadata(maxIterations, iterations, middle, true);
      } else if (sortedList.get(middle).compareTo(target) > 0) {
        max = middle - 1;
      } else {
        min = middle + 1;
      }
    }

    return new BinarySearchMetadata(maxIterations, iterations, -1, false);
  }

  public int calculateMaxIterations() {
    int iterations = 1;
    int currentSize = sortedList.size();
    while(currentSize > 1) {
      iterations++;
      currentSize /= 2;
    }

    return iterations;
  }
}
