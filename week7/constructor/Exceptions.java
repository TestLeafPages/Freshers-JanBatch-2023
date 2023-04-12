package constructor;

public class Exceptions {
public static void main(String[] args) {
	int a=10;
	//
	int[] num= {1,2,3,4,5};
	try {
		System.out.println(num[6]);
		try {
			int sum=a/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Arithmatic");
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Execution Successful");
}
}
