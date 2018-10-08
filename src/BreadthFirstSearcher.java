import java.util.ArrayList;
import java.util.List;

public class BreadthFirstSearcher<T> {
  private final GraphNode<T> head;
  private final T target;
  private final List<T> exploredNodes = new ArrayList<>();

  public BreadthFirstSearcher(GraphNode<T> head, T target) {
    this.head = head;
    this.target = target;
  }

  public SearchMetadata search() {
    for (int searchDepth = 0; true; searchDepth++) {
      int previousSize = exploredNodes.size();
      if(search(head, searchDepth)) {
        return new SearchMetadata(exploredNodes, true);
      }
      if(exploredNodes.size() == previousSize) {
        return new SearchMetadata(exploredNodes, false);
      }
    }
  }

  // return false when children are empty
  private boolean search(GraphNode<T> node, int searchDepth) {
    if (searchDepth == 0) {
      exploredNodes.add(node.getData());
      return node.getData() == target;
    }

    for (GraphNode<T> child : node.getChildren()) {
      if(search(child, searchDepth - 1)) {
        return true;
      }
    }

    return false;
  }
}
