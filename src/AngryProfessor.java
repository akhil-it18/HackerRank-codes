import java.util.Scanner;
public class AngryProfessor {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
			int count=0;
			int n=in.nextInt();
			int k=in.nextInt();
			int[] a=new int[n];
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
				if (a[j]<=0){
					count++;
				}
			}
			if(count<k){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		in.close();
	}
}