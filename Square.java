import java.util.Scanner;

public class Square {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number of a:");
        int a = sc.nextInt();  
       // int a=7; 
         
        int  sq = a*a;

        System.out.println("a="+a);
        System.out.println("Sqaure="+sq);
        sc.close();
    } 
}
