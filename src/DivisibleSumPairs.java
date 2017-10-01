import java.util.Scanner;
public class DivisibleSumPairs {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if((a[i]+a[j])%k==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
