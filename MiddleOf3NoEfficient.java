package others;

import java.util.Scanner;

public class MiddleOf3NoEfficient {
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
			int p1 = A - B;
			int p2 = B - C;
			int p3 = A - C;
			
			if(p1*p2>0)
				return B;
      //check if A is largest  
			else if(p1*p3>0)
				return C;
			else
				return A;
		}
}
