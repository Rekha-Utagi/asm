package logicalprogram;

public class StringToInteger {

	public static void main(String[] args) {

		String s= "malhar";
		try {
			int a = Integer.parseInt(s);
			System.out.println(a);
		
	   	}
		catch(Exception e) {
			System.out.println("Please Enter Valid Number Format");
		}
			
		}

}
