import java.util.Scanner;
public class BonAppetit {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int[] c=new int[n];
		int shared=0;
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
		}
		int bcharged=in.nextInt();
		in.close();
		for(int i=0;i<n;i++){
			if(i!=k){
				shared=shared+c[i];
			}
		}
		int bactual=shared/2;
		if(bcharged-bactual==0){
			System.out.println("Bon Appetit");
		}
		else {
			System.out.print(bcharged-bactual);
		}
	}
}
