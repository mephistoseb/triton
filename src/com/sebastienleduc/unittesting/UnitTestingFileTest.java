package com.sebastienleduc.unittesting;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestingFileTest {

	private static final long DRIVE_SIZE = 1;
	private static final String DRIVE_NAME = "c:";

	@Test
	public void testFreeSpace() throws Exception {
		File file = new File(DRIVE_NAME);
		Assert.assertTrue(UnitTestingFile.checkSpaceFileSystem(DRIVE_SIZE, file));
	}

}
