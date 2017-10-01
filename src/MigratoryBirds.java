import java.util.Scanner;
public class MigratoryBirds {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		in.close();
		int[] arr={0,0,0,0,0};
		for(int i=0;i<n;i++){
			if(a[i]==1){
				arr[0]++;
			}
			else if(a[i]==2){
				arr[1]++;
			}
			else if(a[i]==3){
				arr[2]++;;
			}
			else if(a[i]==4){
				arr[3]++;
			}
			else if(a[i]==5){
				arr[4]++;
			}
		}
		
		int max=arr[0],j=0;
		for(int i=1;i<5;i++){
			if(arr[i]>max){
				max=arr[i];
				j=i;
			}
		}
		System.out.print(j+1);
	}
}
