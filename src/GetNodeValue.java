
public class GetNodeValue {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	int getNode(Node head,int n){
		Node temp=head;
		int length=0;
		while(temp!=null){
			length++;
			temp=temp.next;
		}
		
		temp=head;
		for(int i=0;i<length-n-1;i++){
			temp=temp.next;
		}
		return temp.data;
	}
	
	public static void main(String[] args){
		GetNodeValue l=new GetNodeValue();
		l.head=new Node(1);
		l.head.next=new Node(3);
		l.head.next.next=new Node(5);
		l.head.next.next.next=new Node(6);
		int value=l.getNode(l.head,2);
		System.out.print(value);
	}
}
