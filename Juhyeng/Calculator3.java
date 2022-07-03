package Juhyeng;

import java.util.Scanner;

public class Calculator3 {
	
	int sum(int a, int b) {
		return a+b;	
	}
	int subtract(int a, int b) {
		return a-b;
	}
	int multiply(int a, int b) {
		return a*b;
	}
	int divide(int a, int b) {
		return a/b;
	}
	
	public static void main(String args[]) {
		System.out.println("Calculator class started");
		Scanner sch = new Scanner(System.in) ; 
		Calculator3 csh =new Calculator3();
		csh.sum(0,0);
		csh.subtract(0, 0);
		csh.multiply(0, 0);
		csh.divide(0, 0);
		
		
		System.out.println("A") ;
		int A = sch.nextInt();
		
		System.out.println("B") ;
		int B = sch.nextInt();
		
		System.out.println("+ - * /") ;
		System.out.println("Choose the operator") ;
		
		String C = sch.next();
	
		
		int result =0;
		
		
		if(C.equals("+")) {
			result = csh.sum(A, B);
			 System.out.println("answer="+result);
		}
		else if(C.equals("-")) {
			result=csh.subtract(A, B) ;
			System.out.println("answer="+result);
		}
		else if(C.equals("*")) {
			result=csh.multiply(A, B) ;
			System.out.println("answer="+result);
		}
		else if(C.equals("/")) {
			result=csh.divide(A, B) ;
			System.out.println("answer="+result);
		}
		
		sch.close();
		
	}


}
