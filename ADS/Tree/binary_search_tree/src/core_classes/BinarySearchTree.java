package core_classes;

public class BinarySearchTree {

	//attributes
	Node root;
	
	//constructor
	public BinarySearchTree() {
		root = null;
	}
	
	
	//inserting element
	public void insertElement(int element) {
		root = insertRecursive(root, element);
		System.out.println("Element added.");
	}
	
	
	//recursive insert function
	public Node insertRecursive(Node root, int element) {
		if(root == null) {
			root = new Node(element);
			return root;
		}
		
		if(element < root.element) 
			root.left = insertRecursive(root.left, element);
		else if(element > root.element)
			root.right = insertRecursive(root.right, element);
		
		return root;
	}
	
	
	//in order traversal
	public void inOrderPrint() {
		inOrderRecursive(root);
	}
	
	public void inOrderRecursive(Node root) {
		if(root != null) {
			inOrderRecursive(root.left);
			System.out.println(root.element + " ");
			inOrderRecursive(root.right);
		}
	}
	
	
	//pre-order traversal
	public void preOrderPrint() {
		preOrderRecursive(root);
	}
	
	public void preOrderRecursive(Node root) {
		if(root != null) {
			System.out.println(root.element + " ");
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}
	
	
	//post-order traversal
	public void postOrderPrint() {
		postOrderRecursive(root);
	}
	
	public void postOrderRecursive(Node root) {
		if(root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.println(root.element + " ");
		}
	}
	
    public void printOddLevelNodes() {
        printOddLevelNodesHelper(root, 1);
    }

    private void printOddLevelNodesHelper(Node node, int level) {
        if (node == null) {
            return;
        }

        // If the current level is odd, print the node
        if (level % 2 != 0) {
            System.out.print(node.data + " ");
        }

        // Recursively process left and right subtrees with an incremented level
        printOddLevelNodesHelper(node.left, level + 1);
        printOddLevelNodesHelper(node.right, level + 1);
    }
	
	
}
