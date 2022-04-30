package udemy.treeAndGraphInterviewQuestion;
import java.util.*;

public  class GraphNode {
  public String name;
  public int index;
  public boolean isVisited = false;
  public GraphNode parent;
  public Graph.State state;

  public ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

  public GraphNode(String name, int index) {
    this.name = name;
    this.index = index;
  }
}