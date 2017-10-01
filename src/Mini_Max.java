import java.util.Scanner;
public class Mini_Max {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		long n1=s.nextLong();
        long n2=s.nextLong();
        long n3=s.nextLong();
        long n4=s.nextLong();
        long n5=s.nextLong();
		s.close();
        long max=0,min=n1;
        if(n1>max){
        	max=n1;
        }
        if(n2>max){
        	max=n2;
        }
        if(n3>max){
        	max=n3;
        }
        if(n4>max){
        	max=n4;
        }
        if(n5>max){
        	max=n5;
        }
        
        if(n2<min){
        	min=n2;
        }
        if(n3<min){
        	min=n3;
        }
        if(n4<min){
        	min=n4;
        }
        if(n5<min){
        	min=n5;
        }
		long sum=0;
		sum=n1+n2+n3+n4+n5;
		long min_sum=sum-max;
		long max_sum=sum-min;
		System.out.print(min_sum+" "+max_sum);
	}
}