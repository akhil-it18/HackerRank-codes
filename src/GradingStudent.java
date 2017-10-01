import java.util.Scanner;
public class GradingStudent {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();
		for(i=0;i<n;i++){
			if(a[i]<38){
				System.out.println(a[i]);
			}
			else {
				int nextMultiple=a[i]+5-(a[i]%5);
				if(nextMultiple-a[i]<3){
					System.out.println(nextMultiple);
				}
				else {
					System.out.println(a[i]);
				}
			}
		}
	}
}