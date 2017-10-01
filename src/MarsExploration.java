import java.util.Scanner;
public class MarsExploration {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		in.close();
		char[] ch=str.toCharArray();
		int n=ch.length;
		int j=0,count=0;
		for(j=0;j<=n-1;j++){
			if(j%3==1){
				if(ch[j]!='O'){
					count++;
				}
			}
			else {
				if(ch[j]!='S'){
					count++;
				}
			}
		}
		System.out.print(count);
	}
}