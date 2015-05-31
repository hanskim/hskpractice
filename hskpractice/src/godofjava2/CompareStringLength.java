package godofjava2;

public class CompareStringLength {
	public static void main(String[] args) {
		String str = "I 'm hungry" ;
		String str2 = "I 'M HUNGRY" ;
		String str3 = "왕 배고파" ;
		
		System.out.println("텍스트의 길이 " + str.length());  // 11
		System.out.println("텍스트의 길이 " + str2.length());  // 5 
		System.out.println(str.isEmpty());   //false
		System.out.println("같은지 비교 1 : " + str.equalsIgnoreCase(str2)); //true
		System.out.println("같은지 비교  " + str.compareTo(str3)); 
		 //-50700 ?  하나씩 비교하여 str이 앞이면 양 , 뒤면 음 ?
		System.out.println("같은지 비교4  " + str.compareToIgnoreCase(str2));  // 0 
		
		String str4 = "Hello this is the Earth" ;
		String str5 ="Hello" ;
		System.out.println("비교 5 " + str4.regionMatches(true, 0, str5, 0, 5)); //true
		System.out.println("비교 6 " + str4.regionMatches(true, 0, str5, 0, 6)); //false
	
	}

}
