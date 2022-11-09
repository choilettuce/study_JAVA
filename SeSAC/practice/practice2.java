package practice;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int age = scanner.nextInt();
		if(age <= 0) System.out.println("1이상의 숫자를 입력하세요");
		else if(age <= 7) System.out.println("유아");
		else if(age <= 13) System.out.println("초등학생");
		else if(age <= 16) System.out.println("중학생");
		else if(age <= 19) System.out.println("고등학생");
		else System.out.println("성인");
		scanner.close();
	
}

}