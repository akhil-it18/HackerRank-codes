import java.util.Scanner;
public class CaesarCipher {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String str=in.next();
		int k=in.nextInt();
		char[] ch=str.toCharArray();
		in.close();
		for(int i=0;i<n;i++){
			if(k<26){
			if((ch[i]>=65 && ch[i]<=90-k)||(ch[i]>=97 && ch[i]<=122-k)){
				ch[i]=(char)(ch[i]+k);
			}
			if((ch[i]>122-k && ch[i]<=122)||(ch[i]>90-k && ch[i]<=90)){
				ch[i]=(char)(ch[i]+k-26);
			}
			}
			if(k>=26){
				int r=k%26;
				if((ch[i]>=65 && ch[i]<=90)){
					ch[i]=(char)(ch[i]+r);
					if(ch[i]>90){
						ch[i]=(char)(ch[i]-26);
					}
				}
				else if(ch[i]>=97 && ch[i]<=122){
					ch[i]=(char)(ch[i]+r);
					if(ch[i]>122){
						ch[i]=(char)(ch[i]-26);
					}
				}
			}
		}
		String s=new String(ch);
		System.out.print(s);
	}
}