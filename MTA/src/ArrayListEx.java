import java.util.ArrayList;
import java.util.Scanner;

//��ΰ�
public class ArrayListEx {

	public static void main(String[] args) {
		//���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList �� ����
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String s = scanner.next();//Ű����κ��� �̸� �Է�
			a.add(s);//ArrayList �÷��ǿ� ����			
		}
		//ArrayList�� ����ִ� ��� �̸� ���
		for(int i = 0; i < a.size(); i++) {
			//ArrayList�� i��° ���ڿ� ������
			String name = a.get(i);
			System.out.println(name + " ");		
		}
	}

}
