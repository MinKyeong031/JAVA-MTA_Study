//김민경
public class StringRefEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a 문자열 주소 : " + System.identityHashCode(a));//객체 주소 출력
		System.out.println("b 문자열 주소 : " + System.identityHashCode(b));
		System.out.println("c 문자열 주소 : " + System.identityHashCode(c));
		System.out.println("d 문자열 주소 : " + System.identityHashCode(d));
		System.out.println("e 문자열 주소 : " + System.identityHashCode(e));
		System.out.println("f 문자열 주소 : " + System.identityHashCode(f));
	}

}
