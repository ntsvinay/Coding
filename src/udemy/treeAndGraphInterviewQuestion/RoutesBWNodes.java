package udemy.treeAndGraphInterviewQuestion;

import java.util.LinkedList;

public class RoutesBWNodes {
	public boolean getRoutes(GraphNode node, GraphNode Dis) {
		LinkedList<GraphNode> ll = new LinkedList<>();
		ll.add(node);
		while (!ll.isEmpty()) {
			GraphNode crt = ll.remove(0);
			crt.isVisited = true;
			for (GraphNode nei : crt.neighbors) {
				if (node.name == nei.name) {
					return true;
				} else {
					if (!nei.isVisited) {
						nei.isVisited = true;
						ll.add(nei);
						nei.parent = crt;
					}
				}
			}
		}
		return false;
	}

}
