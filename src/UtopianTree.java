import java.util.Scanner;
public class UtopianTree {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int[] a=new int[t];
		for(int i=0;i<t;i++){
			a[i]=in.nextInt();
		}
		in.close();
		
		for(int i=0;i<t;i++){
			int h=1;
			for(int j=1;j<=a[i];j++){
				if(j%2!=0){
					h=h*2;
				}
				else {
					h=h+1;
				}
			}
			System.out.println(h);
		}
	}
}
