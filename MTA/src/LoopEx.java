//��ΰ�
public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 0;
		
		while(i <= 10) {//1~10���� �ݺ�
			sum += i;
			System.out.print(i);//���ϴ� �� ���
			
			if(i <= 9) {//1~9������ '+' ���
				System.out.print("+");
			}else {//i�� 10�� ���
				System.out.print("=");//'=' ����ϰ�
				System.out.print(sum);//���� ��� ���
			}
			
			i++;
		}
	}

}
