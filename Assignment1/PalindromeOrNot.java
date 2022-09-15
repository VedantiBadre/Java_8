package Assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface PerformOperation {
    boolean check(int a);
}



class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }



   public static PerformOperation isPalindrome() {
        return a -> a == Integer.valueOf(new StringBuilder(String.valueOf(a)).reverse().toString()) ? true : false;
    }
}



	public class PalindromeOrNot {



	   public static void main(String[] args) throws NumberFormatException, IOException {
	        MyMath ob = new MyMath();
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter number to check for Palindrome");
	        int T = Integer.parseInt(br.readLine());



	       PerformOperation op;
	        boolean ret = false;
	        String ans = null;



	       op = ob.isPalindrome();
	        ret = ob.checker(op, T);
	        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
	        System.out.println(ans);
	    }
	
	}

