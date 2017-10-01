import java.util.Scanner;
public class Kangaroo {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		int v1=s.nextInt();
		int x2=s.nextInt();
		int v2=s.nextInt();
		boolean b=catchup(x1,v1,x2,v2);
		if(b==true){
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
	
	static boolean catchup(int x1,int v1,int x2,int v2){
		boolean b=false;
		if(x2>x1 && v2>v1){
			return false;
		}
		
		if(x2<x1 && v2<v1){
			return false;
		}
		
		if(x2>x1){
			while(x2>x1){
				x1=x1+v1;
				x2=x2+v2;
				if(x1==x2){
					return true;
				}
			}
		}
		
		else if(x2<x1){
			while(x2<x1){
				x2=x2+v2;
				x1=x1+v1;
				if(x1==x2){
					return true;
				}
			}
		}
		return b;
	}
}
