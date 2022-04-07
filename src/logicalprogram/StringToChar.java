package logicalprogram;

public class StringToChar {

	public static void main(String[] args) {

		String str="Hello 123$";
		char[] C=new char[str.length()];
		for(int i=0;i<str.length();i++) 
		{
		 C[i]=str.charAt(i);
		}
		 System.out.print(C);

	}

}
