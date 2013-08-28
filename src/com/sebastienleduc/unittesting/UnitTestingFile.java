package com.sebastienleduc.unittesting;

import java.io.File;

/**
 * @author sebastien
 */
public class UnitTestingFile {

	/**
	 * This main is only for my testing purpose.
	 */
	public static void main(String[] args) {
		File file = new File("c:");

		StringBuffer stringBuffer = new StringBuffer();
		System.out.print(stringBuffer.append("If true, there is enough space : ").append(
				checkSpaceFileSystem(1000, file)));
	}

	/**
	 * @param nbBytes : Number of bytes to test
	 * @param fileSystem : The file to test
	 * @return boolean : returns true if there is enough space
	 */
	public static boolean checkSpaceFileSystem(long nbBytes, File fileSystem) {
		return fileSystem.getFreeSpace() - nbBytes >= 0;
	}

}
