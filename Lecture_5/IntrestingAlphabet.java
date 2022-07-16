package Lecture_5;
import java.util.*;

//Code : Interesting Alphabets
//Send Feedback
//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE
//Input format :
//N (Total no. of rows)
//Output format :
//Pattern in N lines
//Constraints
//0 <= N <= 26
//Sample Input 1:
//8
//Sample Output 1:
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH
//Sample Input 2:
//7
//Sample Output 2:
//G
//FG
//EFG
//DEFG
//CDEFG
//BCDEFG
//ABCDEFG

public class IntrestingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	       
	        char ch=(char)(65+n);

	        int i = 1;
	        while(i <= n) {
	        	ch = (char)(ch - i);
	        	int j = 1;
	        	while(j<=i) {
	        		System.out.print(ch);
	        		ch++;
	        		j++;
	        	}
	        	System.out.println();
	        	i++;
	        }
	}

}
