import java.util.Scanner;
public class HackerRankStringRe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int q=in.nextInt();
		for(int i=1;i<=q;i++){
			String s=in.next();
			String str="hackerrank";
			char[] ch1=s.toCharArray();
			char[] ch2=str.toCharArray();
			int j=0;
			for(int k=0;k<ch1.length;k++){
				if(ch1[k]==ch2[j]){
					j++;
					if(j==ch2.length){
						System.out.println("YES");
						break;
					}
				}
			}
			if(j!=ch2.length){
				System.out.println("NO");
			}
		}
	}
}