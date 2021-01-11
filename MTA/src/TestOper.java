//±ËπŒ∞Ê
public class TestOper {

	public static void main(String[] args) {
		int a = 3, b = 3;// ¥Î¿‘ ø¨ªÍ¿⁄ ªÁ∑ 
		a += 3;// a = a + 3 = 6
		b %= 2;//b =  b % 2 = 1
		System.out.println("a = " + a + ", b = " + b);
		
		int c = 2, d = 3;//¡ı∞® ø¨ªÍ¿⁄ ªÁ∑ 
		a = d++ + b;// a = 4, d = 4
		System.out.println("a = " + a + ", d = " + d);
		d = 3;
		a = ++d + b;// a = 5, d = 4
		System.out.println("a = " + a + ", d = " + d);
		a = d-- + b;// a = 5, d = 3
		System.out.println("a = " + a + ", d = " + d);
		a = --d + b;// a = 3, d = 2
		System.out.println("a = " + a + ", d = " + d);
		
		int x = 2, y = 10, z = 0;
		z = x++ * 2 + --y -5 + x*(y%2);//z = 11
	}

}
