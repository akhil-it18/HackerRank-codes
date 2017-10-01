import java.util.Scanner;

public class BalancedBrackets {
	Node head=null;
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
		for(int i=1;i<=n;i++){
			BalancedBrackets b=new BalancedBrackets();
			String str=in.next();
			char[] ch=str.toCharArray();
			int j=0;
			for(j=0;j<ch.length;j++){
				if(ch[j]=='[' || ch[j]=='{' || ch[j]=='('){
					b.push(ch[j]);
				}
				else {
					if(b.head==null){
						break;
					}

					else if (ch[j]==')'){
						if(b.head.data=='('){
							b.head=b.head.next;
						}
					}
					else if(ch[j]=='}'){
						if (b.head.data=='{'){
							b.head=b.head.next;
						}
					}
					else if(ch[j]==']'){
						if(b.head.data=='['){
							b.head=b.head.next;
						}
					}
				}
			}
			if (b.isEmpty()){
				if(j==ch.length){
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			else {
				System.out.println("NO");
			}
		}
		in.close();
	}
	
	void push(char ch){
		Node n=new Node(ch);
		n.next=head;
		head=n;
	}
	
	boolean isEmpty(){
		return head==null;
	}
}
