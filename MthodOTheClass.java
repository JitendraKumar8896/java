package classesobjects;

public class MthodOTheClass {
	
	void sum()
	{
		int a = 10, b = 20;
		System.out.println("Sum is :" +(a+b));
	}
    void subtract()
    {
    	int a = 20, b = 10;
    	System.out.println("Subtraction is:"+(a-b));
    	multiplication();
    }
    void multiplication()
    {
    	int a = 4, b = 5;
    	System.out.println("Multiplication Is:"+(a*b));
    }
    void division()
    {
    	int a = 15, b = 5;
    	System.out.println("Division Is:"+(a/b));
    }
    void power()
    {
    	int base = 5;
    	for (int i =1;i<=base;i++)
    	{
    		System.out.println("Power Is:"+(base*i));
    	}//System.out.println("Power Is:"+(base*i));
    	
    }
	public static void main(String[] args) {
		 MthodOTheClass c1 = new MthodOTheClass();
		 c1.sum();
		 c1.subtract();
        // c1.multiplication();
         c1.division();
         c1.power();
	}

}
