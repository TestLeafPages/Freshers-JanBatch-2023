package constructor;

public class StudentDetails {

	String studentName;
	int registerNumber;
	String address;
	
	public StudentDetails(){
		System.out.println("Default Constructor");
	}
	public StudentDetails(String studentName,int registerNumber,String address){
		this();
		 this.studentName=studentName;
		 this.registerNumber=registerNumber;
		 this.address=address;
		 System.out.println(studentName);
			System.out.println(registerNumber);
			System.out.println(address);
	}
	
	public static void main(String[] args) {
		StudentDetails obj=new StudentDetails("Mani",101,"Chennai");
		System.out.println(obj.studentName);
		System.out.println(obj.registerNumber);
		System.out.println(obj.address);
	}
}
