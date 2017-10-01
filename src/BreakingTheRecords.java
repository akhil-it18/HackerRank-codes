import java.util.Scanner;
public class BreakingTheRecords {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] s=new int[n];
		int bestCount=0;
		int worstCount=0;
		for(int i=0;i<n;i++){
			s[i]=in.nextInt();
		}
		
		in.close();
		int best=s[0];
		int worst=s[0];
		for(int i=1;i<n;i++){
			if(s[i]>best){
				bestCount++;
				best=s[i];
			}
			else if(s[i]<worst){
				worstCount++;
				worst=s[i];
			}
		}
		
		System.out.print(bestCount+" "+worstCount);
	}
}