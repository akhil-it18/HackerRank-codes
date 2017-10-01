import java.util.Scanner;
public class SockMerchant {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		in.close();
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==0){
					break;
				}
				if(a[i]==a[j]){
					count++;
					a[i]=0;
					a[j]=0;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
