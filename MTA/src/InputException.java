import java.util.InputMismatchException;
import java.util.Scanner;

//김민경
public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요>> ");
		try {
			int n = scanner.nextInt();
			System.out.println("입력한 정수 값 : " + n);
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닙니다.");
		}finally {
			System.out.println("프로그램 종료합니다.");
		}
	}

}
