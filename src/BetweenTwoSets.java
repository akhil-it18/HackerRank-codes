import java.util.Scanner;
public class BetweenTwoSets {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int i,j,count=0;
		int[] a=new int[n];
		int[] b=new int[m];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(j=0;j<m;j++){
			b[j]=s.nextInt();
		}
		
		for(int x=a[n-1];x<=b[0];x++){
			for(i=0;i<n;i++){
				if(x%a[i]!=0){
					break;
				}
			}
			for(j=0;j<m;j++){
				if(b[j]%x!=0){
					break;
				}
			}
			if(i==n && j==m){
				count++;
			}
		}
		System.out.print(count);
	}
}
