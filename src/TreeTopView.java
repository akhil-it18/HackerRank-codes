
public class TreeTopView {
	Node root;
	static class Node {
		int key;
		Node left,right;
		Node(int x){
			key=x;
		}
	}
	
	void topView(Node temp){
		Node[] n=new Node[10];
		int i=0;
		while(temp!=null){
			n[i]=temp;
			i++;
			temp=temp.left;
		}
		for(int j=i-1;j>=0;j--){
			System.out.print(n[j].key+" ");
		}
		
		temp=root.right;
		int j=0;
		while(temp!=null){
			n[j]=temp;
			j++;
			temp=temp.right;
		}
		for(int k=0;k<=j-1;k++){
			System.out.print(n[k].key+" ");
		}
	}
	
	public static void main(String[] args){
		TreeTopView tree=new TreeTopView();
		tree.root=new Node(3);
		tree.root.left=new Node(5);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(1);
		tree.root.left.left.right=new Node(9);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.root.right.right.left=new Node(8);
		tree.topView(tree.root);
	}
}
