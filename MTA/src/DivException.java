//��ΰ�
public class DivException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("10�� 5�� ������ ���� " + 10/0 + "�Դϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�!");
		}
	}

}
