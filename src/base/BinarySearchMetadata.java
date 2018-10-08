package base;

public class BinarySearchMetadata {
  private final int maxIterations;
  private final int iterations;
  private final int index;
  private final boolean found;

  public BinarySearchMetadata(int maxIterations, int iterations, int index, boolean found) {
    this.maxIterations = maxIterations;
    this.iterations = iterations;
    this.index = index;
    this.found = found;
  }

  public int getMaxIterations() {
    return maxIterations;
  }

  public int getIterations() {
    return iterations;
  }

  public int getIndex() {
    return index;
  }

  public boolean isFound() {
    return found;
  }
}
