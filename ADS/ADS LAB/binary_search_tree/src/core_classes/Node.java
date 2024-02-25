package core_classes;

public class Node {
	//attributes
	int element;
	Node left;
	Node right;
	
	//constructor
	public Node (int element) {
		this.element = element;
		left = null;
		right = null;
	}
}
