package days;

import java.util.Scanner;

public class SwitchCaseWeek {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));

	}
	public static String getDayName(int day)
	{
		String dayName = "";
		switch(day) {
		case  1: dayName = "Monday"; break;
		case  2: dayName = "Tuesday"; break;
		case  3: dayName = "Wednesday"; break;
		case  4: dayName = "Thursday"; break;
		case  5: dayName = "Friday"; break;
		case  6: dayName = "Saturday"; break;
		case  7: dayName = "Sonday"; break;
		default:dayName = " you Enter Invalid day ...... ";
		System.out.println("Please enter day betwee 1-7");
		}
		return dayName;
	}

}
