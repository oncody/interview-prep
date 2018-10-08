package graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BreadthFirstSearcherTest {
  @Test
  public void search() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateBreadthFirstSearch();
    BreadthFirstSearcher<Integer> breadthFirstSearcher = new BreadthFirstSearcher<>(graph, 12);
    SearchMetadata metadata = breadthFirstSearcher.search();
    Assertions.assertTrue(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    Assertions.assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      Assertions.assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
  @Test
  public void searchCantFind() {
    GraphNode<Integer> graph = GraphNodeGenerator.generateBreadthFirstSearch();
    BreadthFirstSearcher<Integer> breadthFirstSearcher = new BreadthFirstSearcher<>(graph, 13);
    SearchMetadata metadata = breadthFirstSearcher.search();
    Assertions.assertFalse(metadata.isFound());
    System.out.println(metadata.getExploredNodes());
    Assertions.assertEquals(12, metadata.getExploredNodes().size());
    for(int i = 0; i < metadata.getExploredNodes().size(); i++) {
      Assertions.assertEquals(i + 1, metadata.getExploredNodes().get(i));
    }
  }
}
