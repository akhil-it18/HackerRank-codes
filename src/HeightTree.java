
public class HeightTree {
	Node root;
	static int h=0;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	int height(Node root){
		if(root==null){
			return -1;
		}
		
		int h1=height(root.left);
		int h2=height(root.right);
		int hgt=Math.max(h1, h2)+1;
		return hgt;
	}
	
	public static void main(String[] args){
		HeightTree tree=new HeightTree();
		tree.root=new Node(3);
		tree.root.left=new Node(2);
		tree.root.left.left=new Node(1);
		tree.root.right=new Node(5);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(6);
		tree.root.right.right.right=new Node(7);
		int h=tree.height(tree.root);
		System.out.print(h);
	}
}
