import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DepthFirstSearcherTest {
  @Test
  public void search() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateDepthFirstSearch();
    DepthFirstSearcher<Integer> depthFirstSearcher = new DepthFirstSearcher<>(graph, 12);
    SearchMetadata metadata = depthFirstSearcher.search();
    assertTrue(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
  @Test
  public void searchCantFind() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateDepthFirstSearch();
    DepthFirstSearcher<Integer> depthFirstSearcher = new DepthFirstSearcher<>(graph, 13);
    SearchMetadata metadata = depthFirstSearcher.search();
    assertFalse(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
}
