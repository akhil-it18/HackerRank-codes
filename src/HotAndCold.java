import java.util.Scanner;
public class HotAndCold {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int c1=s.nextInt();
		int c2=s.nextInt();
		int h1=s.nextInt();
		int h2=s.nextInt();
		String result=isSatisfiable(c1,c2,h1,h2);
		System.out.println(result);
	}
	static String isSatisfiable(int c1,int c2,int h1,int h2){
		int t1=Math.max(c1, c2);
		int t2=Math.min(h1, h2);
		if(t2>=t1){
			return "YES";
		}
		else 
			return "NO";
	}
}
