import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[])
    {
        float diameter, circumference, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float  radius = sc.nextFloat();

        diameter = 2 * radius;
        circumference = 2 *(float)3.14 * radius;
        area = (float)3.14 * (radius * radius);

        System.out.println("Diameter is :"+diameter);
        System.out.println("circumference is :"+circumference);
        System.out.println("Area of circle is:"+area);

    }
}
