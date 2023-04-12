package constructor;

import java.util.NoSuchElementException;

public class Exceptions2 {
public static void main(String[] args) {
	int a=10;
	//
	int[] num= {1,2,3,4,5};
	try {
		System.out.println(num[6]);
		
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//ArrayIndexOutOfBoundsException
	}
	catch (ArithmeticException e) {
		// TODO Auto-generated catch block
		//ArrayIndexOutOfBoundsException
	}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		// TODO Auto-generated catch block
		//ArrayIndexOutOfBoundsException
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	System.out.println("Execution Successful");
}
}
