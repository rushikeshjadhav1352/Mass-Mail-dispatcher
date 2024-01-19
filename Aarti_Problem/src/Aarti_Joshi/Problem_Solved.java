package Aarti_Joshi;
import java.util.*;
public class Problem_Solved {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        Solution.isArmstrongOrNot(N);

	}
}
	class Solution{
	static void isArmstrongOrNot(int N) {

		
		
		int originalNumber;
        int remainder; 
        int result = 0; 
        int no = 0;
        originalNumber=N;
        
for (;originalNumber != 0; originalNumber /= 10, ++no);      
originalNumber = N;
for (;originalNumber != 0; originalNumber /= 10)
{
    remainder = originalNumber % 10;
    result += Math.pow(remainder, no);
}
if(result == N) {
    System.out.println("1");
}
else {
    System.out.println("0");
}
	

}
	}
