package constructor;

import java.util.NoSuchElementException;

public class LearnFinally {
public static void main(String[] args) {
	int a=10;
	//
	int[] num= {1,2,3,4,5};
	
		try {
			System.out.println(num[6]);
		} finally {
			System.out.println("Execution Successful");
		}
	
}
}
