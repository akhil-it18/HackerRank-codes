import java.util.*;
public class PlusMinus {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		s.close();
		int pos=0,neg=0,zero=0;
		for(int i=0;i<n;i++){
			if(a[i]==0){
				zero++;
			}
			else if(a[i]>0){
				pos++;
			}
			else {
				neg++;
			}
		}
		float fracPos=(float)pos/n;
		float fracNeg=(float)neg/n;
		float fracZero=(float)zero/n;
		System.out.println(fracPos);
		System.out.println(fracNeg);
		System.out.println(fracZero);
	}
}