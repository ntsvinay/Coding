package udemy.treeAndGraphInterviewQuestion;

import java.util.ArrayList;


public class Evaluate {
	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<>();
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		nodeList.add(new GraphNode("F", 5));
		nodeList.add(new GraphNode("G", 6));
		nodeList.add(new GraphNode("H", 7));
		nodeList.add(new GraphNode("G", 8));
		nodeList.add(new GraphNode("H", 9));
		Graph g = new Graph(nodeList);
		g.addDirectedEdge(0, 1);
		g.addDirectedEdge(0, 2);
		g.addDirectedEdge(0, 3);
		g.addDirectedEdge(1, 9);
		g.addDirectedEdge(2, 6);
		g.addDirectedEdge(4, 0);
		g.addDirectedEdge(4, 5);
		g.addDirectedEdge(5, 8);
		g.addDirectedEdge(6, 7);
		g.addDirectedEdge(6, 3);
		RoutesBWNodes rNode=new RoutesBWNodes();
		System.out.println(g.getRoutes(nodeList.get(0), nodeList.get(9)));
	}

}
