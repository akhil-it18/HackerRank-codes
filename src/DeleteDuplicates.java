
public class DeleteDuplicates {
	Node head=null;
	
	static class Node {
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	public void push(int x){
		Node n=new Node(x);
		n.next=head;
		head=n;
	}
	
	void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	Node removeDuplicates(Node head){
		if(head==null){
			return null;
		}
		Node temp=head;
		while(temp!=null){
			int x=temp.data;
			Node n=temp.next;
			while(n!=null){
				if(n.data==x){
					temp.next=n.next;
				}
				n=n.next;
			}
			temp=temp.next;
		}
		return head;
	}
	
	public static void main(String[] args){
		DeleteDuplicates d=new DeleteDuplicates();
		d.push(6);
		d.push(5);
		d.push(3);
		d.push(3);
		d.push(1);
		d.push(1);
		d.printList();
		d.removeDuplicates(d.head);
		d.printList();
	}
}
