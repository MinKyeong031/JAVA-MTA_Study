//김민경
class Student{
	private String name;
	public Student() {name = "java";}
	public Student(String name) {this.name = name;}
	public void print() {
		System.out.println("이름 : " + name);
	}
	public String getName() {
		return name;
	}
	public void setName(String m) {
		name = m;
	}
}

public class Person extends Student{
	int age;
	public Person() {
		age = 10;
	}

	public Person(String name, int age) {
		super(name);//부모 생성자 호출, 반드시 첫 줄에 코딩하기
		this.age = age;
	}
	
	@Override
	public void print() {//오버라이딩
		// TODO Auto-generated method stub
		super.print();//부모 메서드 호출
		System.out.println("나이 : " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("홍길동", 20);
		p.print();
		Student std = new Student();
		std.setName("Hello");
		std.print();
		
		//부모 레퍼런스 = 자식 레퍼런스 할당 가능
		Student ss = new Person();//업캐스팅, 자동 형변환과 비슷
		Person pp = (Person)ss;//다운캐스팅, 강제 형변환
	}
}
