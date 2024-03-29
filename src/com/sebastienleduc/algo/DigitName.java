package com.sebastienleduc.algo;

import java.util.EnumSet;

public enum DigitName {

	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7, "seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	TEN(10, "ten"),
	ELEVEN(11, "eleven"),
	TWELVE(12, "twelve"),
	THIRTEEN(13, "thirteen"),
	FOURTEEN(14, "fourteen"),
	FIFTEEN(15, "fifteen"),
	SIXTEEN(16, "sixteen"),
	SEVENTEEN(17, "seventeen"),
	EIGHTEEN(18, "eighteen"),
	NINETEEN(19, "nineteen");

	private int intValue;
	private String name = "";

	DigitName(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static String getName(int intValue) {
		for (DigitName digitName : EnumSet.range(DigitName.ONE, DigitName.NINETEEN)) {
			if (intValue == digitName.intValue) {
				return digitName.name;
			}
		}
		return "";
	}
}
