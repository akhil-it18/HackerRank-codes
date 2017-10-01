import java.util.Scanner;
public class DrawingBook {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int p=in.nextInt();
		int a,b;
		in.close();
		if(p%2==0){
			a=((p-1)/2)+1;
		}
		else {
			a=(p-1)/2;
		}
		
		if(n%2==0 && p%2!=0){
			b=((n-p)/2)+1;
		}
		else {
			b=(n-p)/2;
		}
		int result=Math.min(a,b);
		System.out.print(result);
	}
}
