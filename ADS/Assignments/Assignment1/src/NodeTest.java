package src;

public class NodeTest {

	private static class Node {
		private int data;
		private Node next;

//		public Node() {
//			
//			data = 0;
//			next = null;
//		}
		public Node(int data) {

			this.data = data;
			next = null;
		}

	}
	public static void main(String[] args) {
Node n1 = new Node(10);
Node n2 = new Node(20);
n1.next = n2;
Node n3 = new Node(30);
n2.next = n3;
System.out.println(n1.next.data);
System.out.println(n1.next);
	}

}
