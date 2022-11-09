package first_project;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("이름, 나이, 키, 결혼 여부를 입력해주세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		int age = scanner.nextInt(); // 정수읽기
		double height = scanner.nextDouble(); // 실수 읽기
		boolean married = scanner.nextBoolean(); //논리값 읽기
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(married);
		
		scanner.close();
	}
	

}
