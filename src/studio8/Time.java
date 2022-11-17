package studio8;

import java.util.Scanner;

public class Time {
	private int hour;
	private int minute;
	private boolean is12or24hrFormat;
	private boolean isPm;
	public Time (int hour, int minute, boolean is12or24hrFormat) {
		this.hour = hour;
		this.minute = minute;
		this.is12or24hrFormat = is12or24hrFormat;
	}
	public static String toString (Time T) {
		String h = Integer.toString(T.hour);
		String m = Integer.toString(T.minute);
		return h + ":" + m;
	}	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the hour?");
		int hour = in.nextInt();
		System.out.println("What is the minute?");
		int minute = in.nextInt();
		System.out.println("write true if it's a 12 hr format or false if it's a 24 hr format?: true or false");
		boolean is12or24hrFormat = in.nextBoolean();
//		System.out.println("Write true if it's pm, false if it's am");
//		boolean isPm = in.nextBoolean();
//		if (is12or24hrFormat == true && isPm == true) {
//			if (hour > 12) {
//				hour -= 12;
//			}
//		}
//		else if (is12or24hrFormat == false) {
////			if (isPm == true && )
//		}
		Time T = new Time(hour, minute, is12or24hrFormat);
		System.out.println(toString(T) + "\nTrue or False: Is the format 12 or 24 hours? " + is12or24hrFormat);
	}
}