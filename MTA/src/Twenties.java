import java.util.Scanner;

//김민경
public class Twenties {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하시오. : ");
		int age = scanner.nextInt();
		
		if((age >= 10) && (age < 20)) {
			System.out.println("10대입니다.");
			System.out.println("10대라서 행복합니다!");
		}else {
			System.out.println("10대가 아닙니다.");
		}
		
		scanner.close();
	}
}
