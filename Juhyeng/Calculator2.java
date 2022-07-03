package Juhyeng;

import java.util.Scanner;

public class Calculator2 {
	
	
	
	public static void main(String args[]) {
		System.out.println("Calculator class started");
		Scanner sch = new Scanner(System.in) ; 
		//Calculator2 Calc = new add(int, int);
		CalC calc = new CalC();
		
		System.out.println("A") ;
		int A = sch.nextInt();
		
		System.out.println("B") ;
		int B = sch.nextInt();
		
		System.out.println("+ - * /") ;
		System.out.println("Choose the operator") ;
		
		String C = sch.next();
	
		
		int result =0;
		
		
		if(C.equals("+")) {
			result=calc.add(A, B);
			System.out.println("answer="+result);
		}
		else if(C.equals("-")) {
			result=calc.subtract(A, B);
			System.out.println("answer="+result);
		}
		else if(C.equals("*")) {
			result=calc.multiply(A, B); ;
			System.out.println("answer="+result);
		}
		else if(C.equals("/")) {
			result=calc.divide(A, B);
			System.out.println("answer="+result);
		}
		
		sch.close();
		
	}
	

		
	
	
}
