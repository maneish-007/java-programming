
public class ArrayJaggedDemo 
{
	public static void main(String args[])
	{
		int array_j[][] = 	{	//Jagged Array
								{1,2,3,4},
								{5,6,7},
								{8,9,10,11,12}
								};
		
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < array_j[i].length; j++)
			{
				System.out.print(array_j[i][j] + " ");
			}
			System.out.println();
		}
	}
}
