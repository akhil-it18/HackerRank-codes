import java.util.Scanner;
public class ProgrammerDay {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int y=in.nextInt();
		in.close();
		if(y<1918){
			if(y%4==0){
				System.out.println("12.09."+y);
			}
			else
				System.out.println("13.09."+y);
		}
		else if(y>1918){
			if(y%400==0||(y%4==0 && y%100!=0)){
				System.out.println("12.09."+y);
			}
			else {
				System.out.println("13.09."+y);
			}
		}
		else {
			System.out.print("26.09."+y);
		}
	}
}