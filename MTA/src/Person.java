//��ΰ�
class Student{
	private String name;
	public Student() {name = "java";}
	public Student(String name) {this.name = name;}
	public void print() {
		System.out.println("�̸� : " + name);
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
		super(name);//�θ� ������ ȣ��, �ݵ�� ù �ٿ� �ڵ��ϱ�
		this.age = age;
	}
	
	@Override
	public void print() {//�������̵�
		// TODO Auto-generated method stub
		super.print();//�θ� �޼��� ȣ��
		System.out.println("���� : " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("ȫ�浿", 20);
		p.print();
		Student std = new Student();
		std.setName("Hello");
		std.print();
		
		//�θ� ���۷��� = �ڽ� ���۷��� �Ҵ� ����
		Student ss = new Person();//��ĳ����, �ڵ� ����ȯ�� ���
		Person pp = (Person)ss;//�ٿ�ĳ����, ���� ����ȯ
	}
}
