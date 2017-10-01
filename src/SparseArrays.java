import java.util.Scanner;
public class SparseArrays {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] str=new String[n];
		for(int i=0;i<n;i++){
			str[i]=s.next();
		}
		
		int q=s.nextInt();
		String[] str2=new String[q];
		for(int i=0;i<q;i++){
			str2[i]=s.next();
		}
		for(int i=0;i<q;i++){
			int count=0;
			for(int j=0;j<n;j++){
				if(str2[i].equals(str[j])){
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}
}
