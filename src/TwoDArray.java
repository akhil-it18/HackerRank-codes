
public class TwoDArray {
	public static void main(String[] args){
		int a[][]={{-1,-1,0,-9,-2,-2},
				   {-2,-1,-6,-8,-2,-5},
				   {-1,-1,-1,-2,-3,-4},
				   {-1,-9,-2,-4,-4,-5},
				   {-7,-3,-3,-2,-9,-9},
				   {-1,-3,-1,-2,-4,-5}
		};
		int max=-1000;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				if(sum>max){
					max=sum;
				}
			}
		}
		System.out.print(max);
	}
}