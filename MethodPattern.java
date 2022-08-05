package classesobjects;

public class MethodPattern {
       void pattern()
       {
    	   int r = 5;
    	   for(int i=1;i<=r;i++)
   	      {
   	    	for(int j =1; j<=i;j++)
   	    	{
   	    		System.out.print("*");
   	    	}
   	    	System.out.println();
   	      }
       }
       
       void binaryPattern()
       {
    	   int r = 5;
    	   for(int i=0;i<=r;i++)
   	      {
   	    	for(int j =0; j<=i;j++)
   	    	{
   	    		System.out.print(i%2+" ");
   	    	}
   	    	System.out.println();
   	      }  
       }
       
	public static void main(String[] args) {
		MethodPattern sc = new MethodPattern();
		sc.pattern();
		System.out.println("\n");
		sc.binaryPattern();

	}

}
