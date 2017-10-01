import java.util.Scanner;
public class PickingNumbersRe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int maxCount=1;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		in.close();
		for(int i=0;i<n-1;i++){
			int count=1,ol=0,og=0;
			for(int j=i+1;j<n;j++){
				if(a[j]==a[i]){
					count++;
				}
				else if(a[j]==a[i]-1){
					ol++;
				}
				else if(a[j]==a[i]+1){
					og++;
				}
			}
			if(ol>=og){
				count+=ol;
			}
			else
				count+=og;
			if(count>maxCount){
				maxCount=count;
			}
		}
			System.out.println(maxCount);
	}
}