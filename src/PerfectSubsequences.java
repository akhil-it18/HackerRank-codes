import java.util.Scanner;
public class PerfectSubsequences {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Return the number of non-empty perfect subsequences mod 1000000007
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            long result = countSubs(s);
            System.out.println(result);
        }
        in.close();
	}
	
    static long countSubs(String s){
    	char[] a=s.toCharArray();
    	long count=0;
    	for(int i=0;i<a.length;i++){
    		if(a[i]=='a'){
    			for(int j=i+1;j<a.length;j++){
    				if(a[j]=='b'){
    					count++;
    				}
    			}
    		}
    		
    		else if(a[i]=='b'){
    			for(int j=i+1;j<a.length;j++){
    				if(a[j]=='a'){
    					count++;
    				}
    			}
    		}
    		
    		else if(a[i]=='c'){
    			for(int j=i+1;j<a.length;j++){
    				if(a[j]=='d'){
    					count++;
    				}
    			}
    		}
    		
    		else if(a[i]=='d'){
    			for(int j=i+1;j<a.length;j++){
    				if(a[j]=='c'){
    					count++;
    				}
    			}
    		}
    		
    		if(a[i]=='a'){
    		for(int j=0;j<a.length;j++){
    			if(a[j]=='b'){
    				for(int k=0;k<a.length;k++){
    					if(a[k]=='c'){
    						for(int l=0;l<a.length;l++){
    							if(a[l]=='d'){
    								count++;
    							}
    						}
    					}
    				}
    			}
    		}
    		}
    	}
    	
    	return count;
    }
}
