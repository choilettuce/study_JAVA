package practice;
import java.util.Scanner;

public class method {
	
	public static void calculate(int num1, int num2) {
		System.out.println("덧셈 결과 : " + ((double)num1 + num2));
		System.out.println("뺄셈 결과 : " + ((double)num1 - num2));
		System.out.println("나눗셈 결과 : " + ((double)num1 / num2));
		System.out.println("곱셈 결과 : " + ((double)num1 * num2));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		calculate(num1, num2);
		scanner.close();

		}
	}
