import java.util.Scanner;
public class TheHurdleRace {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] h=new int[n];
		for(int i=0;i<n;i++){
			h[i]=in.nextInt();
		}
		in.close();
		int max=h[0];
		for(int i=1;i<n;i++){
			if(h[i]>max){
				max=h[i];
			}
		}
		if(max>k){
			System.out.print(max-k);
		}
		else
			System.out.print(0);
	}
}
