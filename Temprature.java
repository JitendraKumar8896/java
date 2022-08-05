import java.util.Scanner;

public class Temprature {
    public static void main(String args[]){

        float Fahrenheit, Celsius;  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius is=");
        Celsius = sc.nextFloat();
        Fahrenheit =((Celsius*9)/5)+32; 
        System.out.println("Temperature in Fahrenheit is: "+Fahrenheit); 

    }
}
