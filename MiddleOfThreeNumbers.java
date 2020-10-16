package others;
import java.util.Scanner;
public class MiddleOf3No {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		int sol = middle(A,B,C);
		System.out.println(sol);
		s.close();
	}	
		private static int middle(int A, int B, int C){
	        if(A>B){
	            if(B>C)
	                return B;
	            else if(A>C)
	                return C;
	            else 
	                return A;
	        }
	        else{
	            if(A>C)
	                return A;
	            else if(B<C)
	                return B;
	            else
	                return C;
	        }
	            
	    }
}
