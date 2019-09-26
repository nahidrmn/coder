package dijkstras.shortest.path.algorithm;

import java.util.Comparator;

/*Class to represent a node in the graph*/
public class Node implements Comparator<Node> {
	public int node;
	public int cost;

	public Node() {
	}

	public Node(int node, int cost) {
		this.node = node;
		this.cost = cost;
	}

	@Override
	public int compare(Node o1, Node o2) {
		if (o1.cost > o2.cost)
			return 1;
		else if (o1.cost < o2.cost)
			return -1;
		else
			return 0;
	}
}