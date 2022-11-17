package studio8;

import java.util.Objects;
import java.util.Scanner;

public class Date {
	public int day;
	public int month;
	@Override
	public int hashCode() {
		return Objects.hash(day, isHoliday, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
	}
	public int year;
	public boolean isHoliday;

	public Date (int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	public static String toString (Date D) {
		String m = Integer.toString(D.month);
		String d = Integer.toString(D.day);
		String y = Integer.toString(D.year);
		return d + "/" + m + "/" + y;
	}	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the day?");
		int day = in.nextInt();
		System.out.println("What is the month?");
		int month = in.nextInt();
		System.out.println("What is the year?");
		int year = in.nextInt();
		System.out.println("Is it a holiday?: true or false");
		boolean isHoliday = in.nextBoolean();
		Date T = new Date(day, month, year, isHoliday);
		System.out.println(toString(T) + "\nTrue or False: Is the day a Holiday? " + isHoliday);
	}
}
