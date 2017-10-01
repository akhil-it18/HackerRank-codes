import java.util.Scanner;
public class FunnyString {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
			int j;
			String s1=in.next();
			StringBuilder str1=new StringBuilder(s1);
			str1.reverse();
			String s2=str1.toString();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			for(j=1;j<=s1.length()-1;j++){
				if(Math.abs(c1[j]-c1[j-1])!=Math.abs(c2[j]-c2[j-1])){
					System.out.println("Not Funny");
					break;
				}
			}
			if(j>s1.length()-1){
				System.out.println("Funny");
			}
		}
	}
}