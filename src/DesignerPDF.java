import java.util.Scanner;
public class DesignerPDF {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] h=new int[26];
		for(int i=0;i<26;i++){
			h[i]=in.nextInt();
		}
		String w=in.next();
		in.close();
		char[] word=w.toCharArray();
		int len=word.length;
		int max=0;
		for(int i=0;i<len;i++){
			if((h[word[i]-97])>max){
				max=h[word[i]-97];
			}
		}
		int area=len*1*max;
		System.out.print(area);
	}
}
