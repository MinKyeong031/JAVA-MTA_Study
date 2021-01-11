import java.util.Scanner;
//김민경
public class BreakExample {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print("입력 : ");
			String text = scanner.next();
			
			if(text.equals("exit")) {//"exit"이 입력되면 반복 종료
				break;
			}
			if(text.equals("skip")) {//"skip"이 입력되면 내용 출력 skip
				continue;
			}
			System.out.println("입력한 내용 : " + text);
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}
