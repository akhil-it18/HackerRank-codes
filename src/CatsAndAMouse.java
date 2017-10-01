import java.util.Scanner;
public class CatsAndAMouse {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int q=in.nextInt();
		int[] x=new int[q];
		int[] y=new int[q];
		int[] z=new int[q];
		for(int i=0;i<q;i++){
			x[i]=in.nextInt();
			y[i]=in.nextInt();
			z[i]=in.nextInt();
		}
		in.close();
		
		for(int i=0;i<q;i++){
			if(Math.abs(x[i]-z[i])>Math.abs(y[i]-z[i])){
				System.out.println("Cat B");
			}
			else if(Math.abs(x[i]-z[i])<Math.abs(y[i]-z[i])){
				System.out.println("Cat A");
			}
			else {
				System.out.println("Mouse C");
			}
		}
	}
}
