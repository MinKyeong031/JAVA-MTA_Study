//��ΰ�
public class StringRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a ���ڿ� �ּ� : " + System.identityHashCode(a));//��ü �ּ� ���
		System.out.println("b ���ڿ� �ּ� : " + System.identityHashCode(b));
		System.out.println("c ���ڿ� �ּ� : " + System.identityHashCode(c));
		System.out.println("d ���ڿ� �ּ� : " + System.identityHashCode(d));
		System.out.println("e ���ڿ� �ּ� : " + System.identityHashCode(e));
		System.out.println("f ���ڿ� �ּ� : " + System.identityHashCode(f));
	}

}
