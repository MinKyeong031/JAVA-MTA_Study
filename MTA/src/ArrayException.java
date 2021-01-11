import java.util.InputMismatchException;

//김민경
public class ArrayException {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		try {
			intArray[3] = 10;//예외 발생하지 않음
			//intArray[6] = 5;//예외 발생
			System.out.println("10을 5로 나누면 몫은 " + 10/0 + "입니다.");
		}catch(ArrayIndexOutOfBoundsException e) {//객체 e에 예외 정보가 넘오엄
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		}catch(InputMismatchException e) {
			System.out.println("입력된 값의 형태를 잘못 입력하셨습니다.");
		}catch(Exception e) {//기타 예외
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
			System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
		}

	}

}
