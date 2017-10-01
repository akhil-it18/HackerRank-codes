import java.util.Scanner;
public class CloudsRevisited {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int e=100;
		int[] c=new int[n];
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		int pos=0;
		do {
			pos=(pos+k)%n;
			if(c[pos]==0){
				e--;
			}
			else if(c[pos]==1){
				e=e-3;
			}
		}while(pos!=0);
		
		System.out.print(e);
	}
}