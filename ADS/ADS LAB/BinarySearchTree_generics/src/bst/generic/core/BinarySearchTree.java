package bst.generic.core;

import java.util.NoSuchElementException;

public class BinarySearchTree<E extends Comparable<E>> {

	Node<E> root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void insert(E val)
	{
		Node<E> newNode = new Node<>(val);
		if(root==null)
			root = newNode;
		else
			insert(root, newNode);
	}
	
	private void insert(Node<E> node, Node<E> newNode)
	{
		if(node.data.compareTo(newNode.data) >= 1)
		{
			if(node.left == null)
				node.left = newNode;
			else
				insert(node.left,newNode);
		}
		else
		{
			if(node.right == null)
				node.right = newNode;
			else
				insert(node.right,newNode);
		}
				
	}
	
	public void remove(E key) {
        if (this.root == null) {
            throw new NoSuchElementException();
        } else {
            this.remove(this.root, key);
        }
    }

    private void remove(Node<E> node, E key) {
        if (node == null) {
            return;
        } else if (key.compareTo(node.data) == 0) {
            this.delete(node);
        } else if (key.compareTo(node.data) < 0) {
            this.remove(node.left, key);
        } else {
            this.remove(node.right, key);
        }
    }

    private void delete(Node<E> node) {
        if (node.left == null && node.right == null) {
            this.root = null;
        } else if (node.left != null) {
            this.root = node.left;
        } else {
            this.root = node.right;
        }
    }
	public void printInorder()
	{
		printInorder(root);
	}
	
	private void printInorder(Node<E> root)
	{
		if(root==null)
			return;
		
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	
	public void printPreorder()
	{
		printPreorder(root);
	}
	
	private void printPreorder(Node<E> root)
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	public void printPostorder()
	{
		printPostorder(root);
	}
	
	private void printPostorder(Node<E> root)
	{
		if(root==null)
			return;
		
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
	}
	
	
}
