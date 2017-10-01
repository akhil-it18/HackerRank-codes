import java.util.Scanner;
public class FindDigits {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
			int count=0;
			String s=in.next();
			int n=s.length();
			int num=Integer.parseInt(s);
			int[] a=new int[n];
			char[] ch=s.toCharArray();
			for(int j=0;j<n;j++){
				a[j]=Character.getNumericValue(ch[j]);
				if(a[j]!=0){
					if(num%a[j]==0){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}