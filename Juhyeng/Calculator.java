package Juhyeng;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		System.out.println("Calculator class started");
		Scanner sch = new Scanner(System.in) ; 
		
		System.out.println("A") ;
		int A = sch.nextInt();
		
		System.out.println("B") ;
		int B = sch.nextInt();
		
		System.out.println("+ - * /") ;
		System.out.println("Choose the operator") ;
		
		String C = sch.next();
	
		
		int result =0;
		
		
		if(C.equals("+")) {
			result=A+B ;
			System.out.println("answer="+result);
		}
		else if(C.equals("-")) {
			result=A-B ;
			System.out.println("answer="+result);
		}
		else if(C.equals("*")) {
			result=A*B ;
			System.out.println("answer="+result);
		}
		else if(C.equals("/")) {
			result=A/B ;
			System.out.println("answer="+result);
		}
		
		sch.close();
		
	}

}
