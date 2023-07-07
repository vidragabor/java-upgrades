package co.uk.wob.format;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {
	public static void main(String[] args) {
		NumberFormat fmt;
		
		fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
		System.out.println("SHORT:");
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(10000000));
		
		fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
		System.out.println("LONG (ENG):");
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(10000000));
		
		fmt = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("HU"), NumberFormat.Style.LONG);
		System.out.println("LONG (HU):");
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(10000000));
		
		
	}
}
