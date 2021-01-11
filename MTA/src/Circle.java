//김민경
public class Circle {
	int radius;
	String name;

	public Circle() {//매개 변수 없는 생성자
		radius = 1; name = "";//raidus의 초기 값은 1
	}
	
	public Circle(int radius, String name) {//매개 변수를 가진 생성자
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return 3.14*radius*radius
;	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle(10, "자바피자");//Circle 객체 생성, 반지름 10
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donunt = new Circle();//Circle 객체 생성, 반지름 1
		donunt.name = "도넛피자";
		area = donunt.getArea();
		System.out.println(donunt.name + "의 면적은 " + area);
	}

}
