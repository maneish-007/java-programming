/*
 * If we want to access data of an object then its rot right to
 * directly access it via object in main() method.
 * The correct approach and the only approach is to use special methods of the object specially designed for 
 * for setting and getting the data of our object
 * Getters and Setters
 * */

class Student
{
	private int rollno;
	private String name;
	
	//Getters and Setters
	
	//Setter method
	public void setRollno(int r)
	{
		System.out.println("User updated rollno.");
		rollno = r;
	}
	
	public String getName() {
		System.out.println("User is accessing name.");
		return name;
	}

	public void setName(String name) {
		System.out.println("User updated name");
		this.name = name;
	}

	//Getter method
	public int getRollno()
	{
		System.out.println("User is accessing rollno");
		return rollno;
	}
	
}

//Encapsulation -> Binding DATA with METHODS
public class EncapsulationDemo 
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setRollno(2);
//		s1.name = "Manish"; name is private so isn't visible
		
		s1.setName("Manish Yadav");
		
		System.out.println("Roll No: " + s1.getRollno());
		System.out.println("Name: " + s1.getName());
	}
}

/*
 * Advantages of Encapsulation
 * 1. Binding Data with Methods
 * 2. Keeping object data(variables) to be PRIVATE
 * 3. Maintaining a LOG FILE of all the Data UPDATES and Data FETCHES
 * 4. Checking for Logged-in User and Authorized access to Private Data(Variables)
 * */












