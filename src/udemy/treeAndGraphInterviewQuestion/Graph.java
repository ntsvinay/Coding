package udemy.treeAndGraphInterviewQuestion;
import java.util.*;


public class Graph {


  static ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

  public enum State {
		Unvisited, Visited, Visiting;
	} 

  public Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList = nodeList;
  }


 
  public void addDirectedEdge(int i, int j) {
    GraphNode first = nodeList.get(i);
    GraphNode second = nodeList.get(j);
    first.neighbors.add(second);
 }

//  Route Between Nodes
  //TODO
  
  public boolean getRoutes(GraphNode node,GraphNode dis){
      LinkedList<GraphNode> ll=new LinkedList<>();
      ll.add(node);
      while(!ll.isEmpty())
      {
          GraphNode crt=ll.remove(0);
          crt.isVisited=true;
          for(GraphNode nei:crt.neighbors)
          {
              if(dis.name==nei.name)
              {
                  return true;
              }
              else{
                  if(!nei.isVisited)
                  {
                      nei.isVisited=true;
                      ll.add(nei);
                      nei.parent=crt;
                  }
              }
          }
      }
      return false;
  }
  

	
}
