
public class Array1DDemo 
{
	public static void main(String args[])
	{
		int nums[]; //1-D array in Java
		nums = new int[4];
		
		nums[0] = 8;
		nums[1] = 12;
		nums[2] = 76;
		nums[3] = 54;
		
		for (int i = 0; i < 4; i++)
		{
			System.out.println(nums[i]);
		}
		
		int nums2[] = {1,2,3,4};
		for (int i = 0; i < 4; i++)
		{
			System.out.println(nums2[i]);
		}
		
	}
}
