import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BreadthFirstSearcherTest {
  @Test
  public void search() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateBreadthFirstSearch();
    BreadthFirstSearcher<Integer> breadthFirstSearcher = new BreadthFirstSearcher<>(graph, 12);
    SearchMetadata metadata = breadthFirstSearcher.search();
    assertTrue(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
  @Test
  public void searchCantFind() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateBreadthFirstSearch();
    BreadthFirstSearcher<Integer> breadthFirstSearcher = new BreadthFirstSearcher<>(graph, 13);
    SearchMetadata metadata = breadthFirstSearcher.search();
    assertFalse(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
}
