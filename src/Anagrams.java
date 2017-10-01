import java.util.Scanner;
public class Anagrams {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=1;i<=t;i++){
			int count=0;
			String s=in.next();
			int n=s.length();
			char[] c=s.toCharArray();
			if(n%2!=0){
				System.out.println(-1);
				continue;
			}
			else {
				for(int j=0;j<n/2;j++){
					int k;
					for(k=n/2;k<n;k++){
						if(c[j]==c[k]){
							c[k]='\0';
							break;
						}
					}
					if(k==n){
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}