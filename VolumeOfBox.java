package classesobjects;

import java.util.Scanner;

public class VolumeOfBox {
       void volume(double l, double w, double h)
       {
    	double vol;
    	   
		   vol = l*w*h;
    	   System.out.println("volume of box :"+ vol);
       }
	public static void main(String[] args) {
		VolumeOfBox c1 = new VolumeOfBox();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length ,width and height:");
		double l =sc.nextDouble();
		double w =sc.nextDouble();
		double h =sc.nextDouble();
		c1.volume(l, w, h);

	}

}
