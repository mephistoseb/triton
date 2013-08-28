package com.sebastienleduc.stwando;

public class StwAndo {

	private static final String STW = "Stw";
	private static final String ANDO = "Ando";

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			StringBuffer strBuffer = new StringBuffer();

			if (i % 3 == 0) {
				strBuffer.append(STW);
			}

			if (i % 5 == 0) {
				strBuffer.append(ANDO);
			}

			System.out.println(strBuffer.length() == 0 ? i : strBuffer.toString());
		}
	}
}
