package com.sebastienleduc.algo;

public class Algorithm {

	private static final String ZERO = "zero";
	private static final String HUNDRED = " hundred";
	private static final String THOUSAND = " thousand";

	public static void main(String[] args) {
		System.out.println(translateNumber(0));
		System.out.println(translateNumber(217));
		System.out.println(translateNumber(1217));
		System.out.println(translateNumber(100282));
		System.out.println(translateNumber(999999));
	}

	public static String translateNumber(int intValue) {
		if (intValue == 0) {
			return ZERO;
		} else if (intValue < 20) {
			return DigitName.getName(intValue);
		} else if (intValue < 100) {
			return getTens(intValue);
		} else if (intValue < 1000) {
			return getHundred(intValue);
		} else {
			return getThousand(intValue);
		}
	}

	private static String getThousand(int intValue) {
		int divThousand = intValue / 1000;
		String hundreds = getHundred(intValue - (divThousand * 1000));
		hundreds = (hundreds != null ? ", " + hundreds : "");

		if (intValue >= 1000 && intValue < 9999) {
			return getDigit(divThousand) + THOUSAND + hundreds;
		} else if (intValue >= 10000 && intValue < 99999) {
			return getTens(divThousand) + THOUSAND + hundreds;
		} else if (intValue >= 100000 && intValue <= 999999) {
			return getHundred(divThousand) + THOUSAND + hundreds;
		}
		return "";
	}

	private static String getHundred(int intValue) {
		int digit = intValue / 100;

		String tens = getTens(intValue - (digit * 100));
		tens = (tens != null ? " " + tens : "");

		return getDigit(digit) + HUNDRED + tens;
	}

	private static String getTens(int intValue) {
		if (intValue >= 20 && intValue < 100) {
			String ten = TenName.getName(intValue / 10);

			int numberMod10 = intValue % 10;
			return (numberMod10 > 0 ? ten + " " + getDigit(numberMod10) : ten);
		} else {
			return getDigit(intValue);
		}
	}

	private static String getDigit(int intValue) {
		if (intValue >= 0 && intValue < 20) {
			return DigitName.getName(intValue);
		}
		return null;
	}

}
