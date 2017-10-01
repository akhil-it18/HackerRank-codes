import java.util.*;
public class ElectronicsShopRe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int n=in.nextInt();
		int m=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<m;i++){
			b[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a[i]+b[j]<=s){
					if(a[i]+b[j]>max){
						max=a[i]+b[j];
					}
				}
			}
		}
		if(max==0){
			System.out.println(-1);
		}
		else
			System.out.println(max);
	}
}