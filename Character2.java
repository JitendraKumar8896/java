package pattern;

public class Character2 {

	public static void main(String[] args) {

		int alphabet = 97;
		int rows = 5;
		
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
                        { 
                                System.out.print((char) (alphabet + j - 1) + " "); 
                        } 
                        System.out.println(); 
                } 
                for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j <= i - 1; j++)
			{
				System.out.print((char) (alphabet + j - 1) + " ");
			}
			System.out.println();
		}

	}

}
