package days;

import java.util.Scanner;

public class AreaOfAllSquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1.Area of a circle ");
		System.out.println("2.Area of a Square ");
		System.out.println("3.Area of a right angled Triangle");
		System.out.println("4.Area of a Rectangle ");
        System.out.println("5.Circumference of a Circle ");
        System.out.println("6.Perimeter of a Square ");
        
        System.out.println("Enter Your Choice..");
        int num = sc.nextInt();
        switch(num) {
        
        case 1: 
        	float r = sc.nextFloat();
    	    float area = ((r*r)*3.14f);
    	    System.out.println("Area of Circle:" +area);
            break; 
            
        case 2:    
        	System.out.println("Enter the side:");
        	float s = sc.nextFloat();
        	System.out.println("Area of Square:"+(s*s));
        	break; 
        	
        case 3:
        	System.out.println("Enter the length and length:");
        	float l1 = sc.nextFloat();
        	float l2 = sc.nextFloat();
        	System.out.println("Area Of Tringle:"+((l1*l2)/2));
        	break; 
        
        case 4:
        	System.out.println("Enter the length and width:");
        	float l = sc.nextFloat();
        	float b = sc.nextFloat();
        	System.out.println("Area Of Rectangle:"+(l*b));
        	break; 
        	
        case 5:
        	System.out.println("Enter rdius:");
        	r = sc.nextFloat();
        	float c = 2*r*(3.14f);
        	System.out.println("Circumference of a Circle:" +c);
            break;
            
        case 6:
        	 System.out.println("Enter the Side :");
        	 float a = sc.nextFloat();
        	 System.out.println("Perimeter of a Square Is: " +(4*a));
        	 
       default:
    	   System.out.println("Invalid choice !!!!");
        }   
        
	}

}
