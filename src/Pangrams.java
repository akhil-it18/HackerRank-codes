import java.util.*;
public class Pangrams {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char[] ch=s.toCharArray();
		HashSet<Character> h=new HashSet<Character>();
		for(int i=0;i<ch.length;i++){
			if((ch[i]>=65 && ch[i]<=90) ||(ch[i]>=97 && ch[i]<=122)){
				if(h.isEmpty()){
					h.add(ch[i]);
				}
				else {
					int count=0;
					for(char c:h){
						if(Math.abs(ch[i]-c)==32)
							break;
						count++;
					}
					if(count==h.size()){
						h.add(ch[i]);
					}
				}
			}
		}
		if(h.size()==26){
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}
	}
}