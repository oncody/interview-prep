import java.util.List;

public class SearchMetadata<T> {
  private List<T> exploredNodes;
  private boolean found = false;

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
