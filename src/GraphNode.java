import java.util.ArrayList;
import java.util.List;

public class GraphNode<T> {
  private final T Data;
  private final List<GraphNode<T>> children;

  public GraphNode(T data) {
    this(data, new ArrayList<>());
  }

  public GraphNode(T data, List<GraphNode<T>> children) {
    Data = data;
    this.children = children;
  }

  public T getData() {
    return Data;
  }

  public List<GraphNode<T>> getChildren() {
    return children;
  }
}
