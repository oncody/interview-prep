package graph;

import java.util.Arrays;

public class GraphNodeGenerator {
  // https://en.wikipedia.org/wiki/Depth-first_search#/media/File:Depth-first-tree.svg
  public static GraphNode<Integer> generateDepthFirstSearch() {
    GraphNode<Integer> four = new GraphNode<>(4);
    GraphNode<Integer> five = new GraphNode<>(5);
    GraphNode<Integer> six = new GraphNode<>(6);
    GraphNode<Integer> seven = new GraphNode<>(7);
    GraphNode<Integer> ten = new GraphNode<>(10);
    GraphNode<Integer> eleven = new GraphNode<>(11);
    GraphNode<Integer> twelve = new GraphNode<>(12);

    GraphNode<Integer> three = new GraphNode<>(3, Arrays.asList(four, five));
    GraphNode<Integer> nine = new GraphNode<>(9, Arrays.asList(ten, eleven));

    GraphNode<Integer> two = new GraphNode<>(2, Arrays.asList(three, six));
    GraphNode<Integer> eight = new GraphNode<>(8, Arrays.asList(nine, twelve));

    return new GraphNode<>(1, Arrays.asList(two, seven, eight));
  }

  // https://en.wikipedia.org/wiki/Breadth-first_search#/media/File:Breadth-first-tree.svg
  public static GraphNode<Integer> generateBreadthFirstSearch() {
    GraphNode<Integer> nine = new GraphNode<>(9);
    GraphNode<Integer> ten = new GraphNode<>(10);
    GraphNode<Integer> six = new GraphNode<>(6);
    GraphNode<Integer> three = new GraphNode<>(3);
    GraphNode<Integer> eleven = new GraphNode<>(11);
    GraphNode<Integer> twelve = new GraphNode<>(12);
    GraphNode<Integer> eight = new GraphNode<>(8);

    GraphNode<Integer> five = new GraphNode<>(5, Arrays.asList(nine, ten));
    GraphNode<Integer> seven = new GraphNode<>(7, Arrays.asList(eleven, twelve));

    GraphNode<Integer> two = new GraphNode<>(2, Arrays.asList(five, six));
    GraphNode<Integer> four = new GraphNode<>(4, Arrays.asList(seven, eight));

    return new GraphNode<>(1, Arrays.asList(two, three, four));
  }
}
