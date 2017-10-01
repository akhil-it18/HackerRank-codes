import java.util.Scanner;
public class JumpingOnTheClouds {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] c=new int[n];
		int i,count=0;
		for(i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		in.close();
		
		i=0;
		while(i!=n-1){
			if(i==n-2){
				i++;
				count++;
			}
			else if(c[i+2]!=1){
				i=i+2;
				count++;
			}
			else {
				i=i+1;
				count++;
			}
		}
		System.out.print(count);
	}
}