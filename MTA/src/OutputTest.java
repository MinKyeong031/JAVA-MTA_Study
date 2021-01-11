//김민경
public class OutputTest {
	public static void main(String[] args) {
		System.out.print("인수 넣기");
		System.out.print("\\n이 자동으로 처리 안됨!!!");
		System.out.println();//enter 처리(/n)
		System.out.println("자동 줄 바꿈 처리 해줌");
		
		int x = 205;
		double y = 10.52368;
		String s = "미림과학고";
		System.out.printf("정수값 = %d, 실수값 = %f, 문자열 = %s\n", x, y, s);
		System.out.printf("정수값 = %5d, 실수값 = %10.2f, 문자열 = %10s\n", x, y, s);
		System.out.printf("정수값 = %05d, 실수값 = %010.2f, 문자열 = %10s\n", x, y, s);
		System.out.println("\nprintf 대신 format으로 사용~~~\n");
		System.out.format("정수값 = %d, 실수값 = %f, 문자열 = %s\n", x, y, s);
		System.out.format("정수값 = %5d, 실수값 = %10.2f, 문자열 = %10s\n", x, y, s);
		System.out.format("정수값 = %05d, 실수값 = %010.2f, 문자열 = %10s\n", x, y, s);
	}
}
