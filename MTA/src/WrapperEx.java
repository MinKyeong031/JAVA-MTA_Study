//��ΰ�
public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer ���
		System.out.println(Integer.parseInt("28"));
		System.out.println(Integer.toString(28));
		Integer i = Integer.valueOf(28);
		
		//Double ���
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		
		//Boolean ���
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}

}
