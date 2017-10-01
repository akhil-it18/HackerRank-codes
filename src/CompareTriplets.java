
public class CompareTriplets {
	public static void main(String[] args){
		int a0=5,a1=6,a2=7;
		int b0=3,b1=6,b2=10;
		int[] result=solve(a0,a1,a2,b0,b1,b2);
		for(int a:result){
			System.out.print(a+" ");
		}
	}
	
	static int[] solve(int a0,int a1,int a2,int b0,int b1,int b2){
		int[] result={0,0};
		if(a0>b0){
            result[0]++;
        }
        else if(b0>a0){
            result[1]++;
        }
        if(a1>b1){
            result[0]++;
        }
        else if(b1>a1){
            result[1]++;
        }
        if(a2>b2){
            result[0]++;
        }
        else if(b2>a2)
            result[1]++;
		return result;
	}
}