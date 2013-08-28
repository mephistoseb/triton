package com.sebastienleduc.fib;

class Fib {

	/**
	 * Advantages : 1 - You can keep of the present value and put it aside. 2 - Recursion can be heavy on the compiler
	 * so iteration can make it easier.
	 */
	private static final int MAX = 10;
	private static final int JUMP = 3;

	public static void main(String[] args) {

		int fn = 1;
		int fnp1 = JUMP;

		for (int iter = 0; iter < MAX; iter++) {
			System.out.print(fn + " ");
			int tmp = fnp1;
			fnp1 = JUMP * fnp1 - fn;
			fn = tmp;
		}
	}
}
