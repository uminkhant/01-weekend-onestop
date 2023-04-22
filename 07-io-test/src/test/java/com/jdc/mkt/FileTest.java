package com.jdc.mkt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	void fileTest() throws IOException {
		
		File file = new File("test.txt");
		assertFalse(file.exists());
		
		
		file.createNewFile();
		assertTrue(file.exists());
		
//		file.delete();
//		assertFalse(file.exists());
		
		file.deleteOnExit();
		assertTrue(file.exists());
		
		String name = file.getName();
		//System.out.println(name);
		System.out.println(file.getAbsolutePath());
		
	}
	
	
	
	
	
	
	
}
