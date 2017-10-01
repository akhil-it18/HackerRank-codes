import java.util.Scanner;
public class ApplesandOranges {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int t=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		int m=in.nextInt();
		int n=in.nextInt();
		int countapples=0,countoranges=0;
		int[] distapples=new int[m];
		int[] distoranges=new int[n];
		for(int i=0;i<m;i++){
			distapples[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			distoranges[i]=in.nextInt();
		}
		
		in.close();
		
		for(int i=0;i<m;i++){
			int pos=a+distapples[i];
			if(pos>=s && pos<=t){
				countapples++;
			}
		}
		
		for(int i=0;i<n;i++){
			int pos=b+distoranges[i];
			if(pos>=s && pos<=t){
				countoranges++;
			}
		}
		
		System.out.println(countapples);
		System.out.println(countoranges);
	}
}
