package graph;

import java.util.List;

public class SearchMetadata<T> {
  private final List<T> exploredNodes;
  private final boolean found;

  public SearchMetadata(List<T> exploredNodes, boolean found) {
    this.exploredNodes = exploredNodes;
    this.found = found;
  }

  public List<T> getExploredNodes() {
    return exploredNodes;
  }

  public boolean isFound() {
    return found;
  }
}
