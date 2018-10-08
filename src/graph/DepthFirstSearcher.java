package graph;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearcher<T> {
  private final GraphNode<T> head;
  private final T target;
  private final List<T> exploredNodes = new ArrayList<>();

  public DepthFirstSearcher(GraphNode<T> head, T target) {
    this.head = head;
    this.target = target;
  }

  public SearchMetadata search() {
    return new SearchMetadata(exploredNodes, search(head));
  }

  private boolean search(GraphNode<T> node) {
    exploredNodes.add(node.getData());

    if(node.getData() == target) {
      return true;
    }

    for(GraphNode<T> child : node.getChildren()) {
      if(search(child)) {
        return true;
      }
    }

    return false;
  }
}
