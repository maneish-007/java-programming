
public class Array2DDemo 
{
	public static void main(String args[])
	{		
		int array2d[][] = 	{
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12}
							};
		//Normal for loop
//		for (int i = 0; i < 3; i++)
//		{			
//			for (int j = 0; j < 4; j++)
//			{
//				System.out.print(array2d[i][j] + " ");
//			}
//			System.out.println();
//		}
		//Enhanced for loop
		for (int row[]: array2d)
		{
			for (int column: row)
			{
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}





