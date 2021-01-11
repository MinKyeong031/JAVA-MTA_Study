//김민경
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(", C++ ");
		System.out.println(a + "의 길이는 " + a.length());//문자열의 길이(문자 개수)
		
		a = a+b;//문자열 연결
		a = a.trim();//문자열 앞 뒤의 공백 제거
		System.out.println(a);
		a = a.substring(3);//인덱스 3부터 끝까지 서브 스트링 리턴
		System.out.println(a);
		char c = a.charAt(2);//인덱스 2의 문자 리턴
		System.out.println(c);
	}

}
