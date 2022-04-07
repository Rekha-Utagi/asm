package logicalprogram;

public class StringPalindrom {

	public static void main(String[] args) {
 
		String str="nitin";
		
		StringBuffer str1=new StringBuffer(str);
		StringBuffer rev = str1.reverse();
		if(str.equals(rev.toString())) 
		{
			System.out.println("This  a palindrome " );
		}
		else
		{
			System.out.println("This is not a palindrome");	
		}
	}

}
