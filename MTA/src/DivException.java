//김민경
public class DivException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("10을 5로 나누면 몫은 " + 10/0 + "입니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}
	}

}
