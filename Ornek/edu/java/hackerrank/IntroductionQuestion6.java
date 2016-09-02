package edu.java.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntroductionQuestion6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String month = in.next();
		String day = in.next();
		String year = in.next();

		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1,
				Integer.parseInt(day));

		String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, Locale.US);

		System.out.print(dayOfWeek.toUpperCase());

	}

}