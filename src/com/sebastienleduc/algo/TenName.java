package com.sebastienleduc.algo;

import java.util.EnumSet;

public enum TenName {

	TEN(1, "ten"),
	TWENTY(2, "twenty"),
	THIRTY(3, "thirty"),
	FORTY(4, "forty"),
	FIFTY(5, "fifty"),
	SIXTY(6, "sixty"),
	SEVENTY(7, "seventy"),
	EIGHTY(8, "eighty"),
	NINETY(9, "ninety");

	private int intValue;
	private String name = "";

	TenName(int intValue, String name) {
		this.intValue = intValue;
		this.name = name;
	}

	public static String getName(int intValue) {
		for (TenName tenName : EnumSet.range(TenName.TEN, TenName.NINETY)) {
			if (intValue == tenName.intValue) {
				return tenName.name;
			}
		}
		return "";
	}
}
