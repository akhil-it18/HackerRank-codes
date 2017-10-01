import java.util.Scanner;
public class CamelCase {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char[] ch=s.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++){
			if(ch[i]>=65 && ch[i]<=96){
				count++;
			}
		}
		System.out.println(count);
		in.close();
	}
}
