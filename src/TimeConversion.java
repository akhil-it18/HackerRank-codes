import java.util.Scanner;
public class TimeConversion {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		in.close();
		char[] ch=s.toCharArray();
		if(ch[8]=='A'){
			if(ch[0]=='1' && ch[1]=='2'){
				ch[0]='0';
				ch[1]='0';
			}
			for(int i=0;i<=7;i++){
				System.out.print(ch[i]);
			}
		}
		else if(ch[8]=='P'){
			if(!(ch[0]=='1' && ch[1]=='2')){
			char[] chhr=new char[2];
			chhr[0]=ch[0];
			chhr[1]=ch[1];
			String str=new String(chhr);
			int hr=Integer.parseInt(str);
			hr=hr+12;
			System.out.print(hr);
			for(int i=2;i<=7;i++){
				System.out.print(ch[i]);
			}
			}
			else {
				for(int i=0;i<=7;i++){
					System.out.print(ch[i]);
				}
			}
		}
	}	
}