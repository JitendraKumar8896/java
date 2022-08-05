package alphabet;

import java.util.Scanner;

public class MagicBoard {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digit:"); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		char q=(char)a;
        char w=(char)b;
        char e=(char)c;
        char r=(char)d;
     
            System.out.println("Simple output is ......");
            System.out.println(a+ "-" +q);  
            System.out.println(b+ "-" +w); 
            System.out.println(c+ "-" +e); 
            System.out.println(d+ "-" +r);
        
        
	}

}
