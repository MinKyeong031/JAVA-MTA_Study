import java.util.Scanner;
//��ΰ�
public class BreakExample {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print("�Է� : ");
			String text = scanner.next();
			
			if(text.equals("exit")) {//"exit"�� �ԷµǸ� �ݺ� ����
				break;
			}
			if(text.equals("skip")) {//"skip"�� �ԷµǸ� ���� ��� skip
				continue;
			}
			System.out.println("�Է��� ���� : " + text);
		}
		System.out.println("�����մϴ�...");
		scanner.close();
	}
}
