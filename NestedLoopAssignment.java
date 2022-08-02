
public class NestedLoopAssignment 
{
	public static void main(String args[])
	{
		int N = 5;
		//ABCD pattern
		for (int i = 0; i < N; i++)
		{
			char c = 65;
			for (int j = 0; j <= i; j++)
			{
				System.out.print(c + " ");
				c += 1;
			}
			System.out.println();
		}
		
		//$ box pattern
		for (int i = 0; i < N; i++)
		{
			if (i == 0 || i == N - 1)
			{
				for (int j = 0; j < N; j++)
				{
					System.out.print("$ ");
				}
				System.out.println();
			}
			else
			{
				System.out.print("$ ");
				for (int j = 0; j < N-2; j++)
				{
					System.out.print("  ");
				}
				System.out.print("$ ");
				System.out.println();
			}
			
		}
	
	}
}
