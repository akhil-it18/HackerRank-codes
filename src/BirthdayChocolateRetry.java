import java.util.Scanner;
public class BirthdayChocolateRetry {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++){
			s[i]=in.nextInt();
		}
		int d=in.nextInt();
		int m=in.nextInt();
		in.close();
		int count=0;
		for(int i=0;i<=n-m;i++){
			int l=m-1;
			int k=i,sum=0;
			for(int j=1;j<=l;j++){
				sum+=s[k+1];
				k++;
			}
			if(s[i]+sum==d){
				count++;
			}
		}
		System.out.print(count);
	}
}