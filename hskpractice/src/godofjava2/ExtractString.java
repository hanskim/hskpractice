package godofjava2;

public class ExtractString {

	public static void main(String[] args) {
		String str1 = "Welcome to a ToMaeTugi  Worldtour and a tomybest computer" ; 
		
		System.out.println("��ü������� : " + str1.trim().length()); //57
		System.out.println("�׳� to�� �������� ã�� : " + str1.indexOf("to")); //8 
		System.out.println("�׳� to�� ���������� ã�� : " + str1.lastIndexOf("to")); //40 ,to
		System.out.println("�׳� to(����)�� ���������� ã�� : " + str1.lastIndexOf("to ")); //8 ,tomybest
		System.out.println("�׳� to�� ���������� ã�� : " + str1.lastIndexOf('t'));  //54 ,
		System.out.println("a�� �������� �����Ͽ� ã�� : " + str1.indexOf('a',20));  //34 ,and
		System.out.println("a(����)�� �������� �����Ͽ� ������ã�� : " + str1.lastIndexOf("a ",20));  //11 ,

	}

}
