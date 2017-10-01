import java.util.Scanner;
public class ViralAdvertising {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=2;
		int num=5/2;
		for(int i=2;i<=n;i++){
			num=(num*3)/2;
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
