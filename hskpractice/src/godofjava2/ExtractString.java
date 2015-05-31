package godofjava2;

public class ExtractString {

	public static void main(String[] args) {
		String str1 = "Welcome to a ToMaeTugi  Worldtour and a tomybest computer" ; 
		
		System.out.println("전체문장길이 : " + str1.trim().length()); //57
		System.out.println("그냥 to의 시작지점 찾기 : " + str1.indexOf("to")); //8 
		System.out.println("그냥 to의 마지막지점 찾기 : " + str1.lastIndexOf("to")); //40 ,to
		System.out.println("그냥 to(공백)의 마지막지점 찾기 : " + str1.lastIndexOf("to ")); //8 ,tomybest
		System.out.println("그냥 to의 마지막지점 찾기 : " + str1.lastIndexOf('t'));  //54 ,
		System.out.println("a의 시작지점 지정하여 찾기 : " + str1.indexOf('a',20));  //34 ,and
		System.out.println("a(공백)의 시작지점 지정하여 마지막찾기 : " + str1.lastIndexOf("a ",20));  //11 ,

	}

}
