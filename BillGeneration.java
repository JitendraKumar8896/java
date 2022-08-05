import java.util.Scanner;

public class BillGeneration {
    public static void main(String [] args){
        int pizzaprice = 100, buffprice = 20, colddrinksprice = 10;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();
        System.out.print("Enter the no of buffs bought:");
        int buffs = sc.nextInt();
        System.out.print("Enter the no of colddrinks bought:"); 
        int colddrinks = sc.nextInt();

        int pizz = pizzaprice * pizzas;
        int buff = buffprice *buffs;
        int colddrink = colddrinksprice * colddrinks;

        int Total_Price = pizz + buff + colddrink;

        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizzas);
        System.out.println("No of puffs:"+buffs);
        System.out.println("No of cooldrinks:"+colddrinks);
        System.out.println("Total price="+Total_Price);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
