package logicalprogram;

public class FindOddEvenUpto100 {

	public static void main(String[] args) {
     
		//int a=10;
		for(int i= 10;i>=0;i--) {
			int Rem = i%2;
		 if(Rem==0) {
			 System.out.println("Even no: "+i);
		 }
		 else {
			 System.out.println("Odd No: "+i);
		 }
		
		}
		
		
		
	}

}
