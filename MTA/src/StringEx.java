//��ΰ�
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(", C++ ");
		System.out.println(a + "�� ���̴� " + a.length());//���ڿ��� ����(���� ����)
		
		a = a+b;//���ڿ� ����
		a = a.trim();//���ڿ� �� ���� ���� ����
		System.out.println(a);
		a = a.substring(3);//�ε��� 3���� ������ ���� ��Ʈ�� ����
		System.out.println(a);
		char c = a.charAt(2);//�ε��� 2�� ���� ����
		System.out.println(c);
	}

}
