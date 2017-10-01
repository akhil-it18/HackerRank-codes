import java.util.Scanner;
public class MaximumElementRe {
	Node head;
	int max;
	static class Node {
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		MaximumElementRe s=new MaximumElementRe();
		for(int i=1;i<=n;i++){
			int ch=in.nextInt();
			switch(ch){
			case 1:
				int x=in.nextInt();
				s.push(x);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				int max=s.maximum();
				System.out.println(max);
			}
		}
		in.close();
	}
	
	void push(int x){
		Node n=new Node(x);
		n.next=head;
		head=n;
		if(x>max){
			max=x;
		}
	}
	
	void pop(){
		int temp=head.data;
		head=head.next;
		Node n=head;
		if(max==temp){
			max=0;
		}
		while(n!=null){
			if(n.data>max){
				max=n.data;
			}
			n=n.next;
		}
	}
		
	int maximum(){
		return max;
	}
}