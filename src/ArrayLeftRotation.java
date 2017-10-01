import java.util.Scanner;
public class ArrayLeftRotation {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rots=s.nextInt();
		int i;
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();
		for(i=1;i<=rots;i++){
			int temp=a[0],j;
			for(j=0;j<n-1;j++){
				a[j]=a[j+1];
			}
			a[j]=temp;
		}
		for(int k:a){
			System.out.print(k+" ");
		}
	}
}