package Lecture_5;
import java.util.*;

//Code : Reverse Number Pattern
//Send Feedback
//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//21
//321
//4321
//Input format :
//Integer N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 50
//Sample Input 1:
//5
//Sample Output 1:
//1
//21
//321
//4321
//54321
//Sample Input 2:
//6
//Sample Output 2:
//1
//21
//321
//4321
//54321
//654321

public class Reverse_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	       
	        int i = 1;
	        while(i <= n){
	        	int p = i;
	            int j = 1;
	            while(j <= i){
	                System.out.print(p);
                 p--;
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	}

}
