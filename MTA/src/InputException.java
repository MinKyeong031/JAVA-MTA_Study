import java.util.InputMismatchException;
import java.util.Scanner;

//��ΰ�
public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>> ");
		try {
			int n = scanner.nextInt();
			System.out.println("�Է��� ���� �� : " + n);
		}catch(InputMismatchException e) {
			System.out.println("������ �ƴմϴ�.");
		}finally {
			System.out.println("���α׷� �����մϴ�.");
		}
	}

}
