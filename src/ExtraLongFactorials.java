import java.util.Scanner;
import java.math.BigInteger;
public class ExtraLongFactorials {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		BigInteger res=factorial(n);
		System.out.println(res);
	}
	
	static BigInteger factorial(int n){
		BigInteger f=BigInteger.valueOf(1);
		for(int i=1;i<=n;i++){
			f=f.multiply(BigInteger.valueOf(i));
		}
		return f;
	}
}