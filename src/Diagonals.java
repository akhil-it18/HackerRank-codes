import java.util.Scanner;
public class Diagonals {
	public static void main(String[] args){
		int i,j,rd=0,ld=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] a=new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(i==j){
					rd=rd+a[i][j];
				}
			}
		}
		for(i=0;i<n;i++){
			ld=ld+a[i][n-1-i];
		}
		int result=Math.abs(rd-ld);
		System.out.print(result);
	}
}