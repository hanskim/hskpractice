package godofjava2;

public class CompareStringLength {
	public static void main(String[] args) {
		String str = "I 'm hungry" ;
		String str2 = "I 'M HUNGRY" ;
		String str3 = "�� �����" ;
		
		System.out.println("�ؽ�Ʈ�� ���� " + str.length());  // 11
		System.out.println("�ؽ�Ʈ�� ���� " + str2.length());  // 5 
		System.out.println(str.isEmpty());   //false
		System.out.println("������ �� 1 : " + str.equalsIgnoreCase(str2)); //true
		System.out.println("������ ��  " + str.compareTo(str3)); 
		 //-50700 ?  �ϳ��� ���Ͽ� str�� ���̸� �� , �ڸ� �� ?
		System.out.println("������ ��4  " + str.compareToIgnoreCase(str2));  // 0 
		
		String str4 = "Hello this is the Earth" ;
		String str5 ="Hello" ;
		System.out.println("�� 5 " + str4.regionMatches(true, 0, str5, 0, 5)); //true
		System.out.println("�� 6 " + str4.regionMatches(true, 0, str5, 0, 6)); //false
	
	}

}
