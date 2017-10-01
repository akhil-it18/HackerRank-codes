import java.util.Scanner;
public class SuperReducedStringRe {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		StringBuilder s=new StringBuilder(str);
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				s.delete(i,i+2);
				i=-1;
			}
		}
		if(s.length()==0){
			System.out.print("Empty String");
			return;
		}
		System.out.print(s);
	}
}