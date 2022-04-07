package logicalprogram;

public class WithoutStrBufferPalindrome {

	public static void main(String[] args) {

		String str="NITIN";
		int str1 = str.length();
		String res = "";
		for(int i=str1-1;i>=0;i--)
		{
			 res = res  + Character.toString(str.charAt(i));
			
		}
		if(str.equals(res)) {
			System.out.println("this is palindrome");
			
		}
	}

}
