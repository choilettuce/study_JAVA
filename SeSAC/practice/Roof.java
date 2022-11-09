package practice;
import java.util.Scanner;

public class Roof {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = scanner.nextInt();
		if(num > 0) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+ " ");
			}
		}
		else {
			System.out.print("0이상의 숫자를 입력해주세요");
		}
		scanner.close();
		
	}


}
