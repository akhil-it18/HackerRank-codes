import java.util.Scanner;
public class BirthdayCandles {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();
		int max=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]==max){
				count++;
			}
		}
		System.out.print(count);
	}
}