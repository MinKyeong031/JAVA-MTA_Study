//��ΰ�
public class Circle {
	int radius;
	String name;

	public Circle() {//�Ű� ���� ���� ������
		radius = 1; name = "";//raidus�� �ʱ� ���� 1
	}
	
	public Circle(int radius, String name) {//�Ű� ������ ���� ������
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return 3.14*radius*radius
;	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "�ڹ�����");//Circle ��ü ����, ������ 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);

		Circle donunt = new Circle();//Circle ��ü ����, ������ 1
		donunt.name = "��������";
		area = donunt.getArea();
		System.out.println(donunt.name + "�� ������ " + area);
	}

}
