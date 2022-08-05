package classesobjects;

public class ParamitrisezMethod {
     void sum(int a, int b)
     {
    	 System.out.println("Sum :"+(a+b));
     }
     void subtraction(int a, int b)
     {
    	 System.out.println("Subtraction:"+(a-b));
     }
     void division(int a, int b)
     {
    	 System.out.println("Division:"+(a/b));
     }
     void multi(int a,int b)
     {
    	 System.out.println("Multiplication:"+(a*b));
     }
     void power(int num , int p)
		{
			  int product = 1; 
			  for(int i =1; i<=p;i++) 
			  { 
				  product = product*num;
			}
			 
    	 System.out.println(num+"^" +p+":" +product);
     }
     
	public static void main(String[] args) {
		 ParamitrisezMethod c1 = new  ParamitrisezMethod();
         c1.sum(100,200); 
         c1.subtraction(20,10);
         c1.division(30, 10);
         c1.multi(20, 10);
         c1.power(5,3);
	}

}
