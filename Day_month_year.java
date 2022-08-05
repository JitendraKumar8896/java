import java.util.Scanner;

public class Day_month_year {
    public static void main(String args[]){
        int days, years, weeks, months;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter days :");
        days=sc.nextInt();
        years=days/365;
        weeks=days/7;
        months=days/30;
   
        System.out.println("Days to years "+years);
        System.out.println("Days to weeks "+weeks);
        System.out.println("Days to months "+months);
    }
}
