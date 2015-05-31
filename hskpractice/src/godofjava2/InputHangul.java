package godofjava2;

public class InputHangul {
	public static void main(String[] args) {

		InputHangul hangul = new InputHangul();
		hangul.HangulChange();

	}

	public void HangulChange() {
		String str1 = "¸¶Â¡°¡";
		byte[] arr1 = str1.getBytes();
		
	
		for (byte input : arr1) {
			System.out.print(input);
		}
		System.out.println("");
		String str11 = new String(arr1);
		System.out.println(str11);
		
	
	}

}
