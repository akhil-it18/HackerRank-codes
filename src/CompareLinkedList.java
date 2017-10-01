
public class CompareLinkedList {
	Node head;
	static class Node {
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	static boolean compareList(Node head1,Node head2){
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null && temp2!=null){
			if(temp1.data==temp2.data){
				temp1=temp1.next;
				temp2=temp2.next;
			}
			else {
				break;
			}
		}
		if(temp1==null && temp2==null){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args){
		CompareLinkedList l1=new CompareLinkedList();
		CompareLinkedList l2=new CompareLinkedList();
		l2.head=new Node(1);
		boolean b=compareList(l1.head,l2.head);
		System.out.println(b);
	}
}