import java.util.InputMismatchException;

//��ΰ�
public class ArrayException {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		try {
			intArray[3] = 10;//���� �߻����� ����
			//intArray[6] = 5;//���� �߻�
			System.out.println("10�� 5�� ������ ���� " + 10/0 + "�Դϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {//��ü e�� ���� ������ �ѿ���
			System.out.println("�迭�� ������ �ʰ��Ͽ� ���Ҹ� �����Ͽ����ϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
		}catch(InputMismatchException e) {
			System.out.println("�Էµ� ���� ���¸� �߸� �Է��ϼ̽��ϴ�.");
		}catch(Exception e) {//��Ÿ ����
			System.out.println("�迭�� ������ �ʰ��Ͽ� ���Ҹ� �����Ͽ����ϴ�.");
			System.out.println("�迭�� ������ �ʰ��Ͽ� ���Ҹ� �����Ͽ����ϴ�.");
		}

	}

}
