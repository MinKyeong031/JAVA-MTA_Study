import java.util.Scanner;

//��ΰ�
public class Twenties {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է��Ͻÿ�. : ");
		int age = scanner.nextInt();
		
		if((age >= 10) && (age < 20)) {
			System.out.println("10���Դϴ�.");
			System.out.println("10��� �ູ�մϴ�!");
		}else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
		
		scanner.close();
	}
}
