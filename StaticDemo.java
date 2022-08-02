
class Emp
{
//	int eid;
//	int salary;
//	static String ceo;
	
	static     //When we load a class
	{
		System.out.println("Inside static block 1");
	}
	public Emp() //When we create an object
	{
		System.out.println("Inside Constructor");
//		eid = 1;
//		salary = 3000;
//		ceo = "Larry";
	}
	static     //When we load a class
	{
		System.out.println("Inside static block 2");
	}
	
	public void show()
	{
//		System.out.println("Eid: " + eid);
//		System.out.println("Salary: " + salary);
//		System.out.println("CEO: " + ceo);
	}
}

public class StaticDemo 
{
	public static void main(String args[])
	{
//		Emp navin = new Emp(); 
//		//Object created from HEAP memory
//		Emp rahul = new Emp();
		
		Emp obj1 = new Emp();
		Emp obj2 = new Emp();
		Emp obj3 = new Emp();
		Emp obj4 = new Emp();
		Emp obj5 = new Emp();
		
//		navin.eid = 8;
//		navin.salary = 4000;
//		//navin.ceo = "Mahesh";
//		
//		rahul.eid = 9;
//		rahul.salary = 5000;
//		Emp.ceo = "Mahesh";
//
//		navin.show();
//		rahul.show();
	}

}
