package com.jdc.mkt;

import static org.assertj.core.api.Assertions.catchException;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DataFileTest {

	
	static File file;
	
	@BeforeAll
	static void createFile() throws IOException {
		
		file = new File("test.dat");
		
		if(!file.exists()) {
			file.createNewFile();
		}
	}
	
	@Test
	void dataTest() {
		writeDataFile();
		readDataFile();
	}
	
	void readDataFile() {
		try(DataInputStream dIn = new DataInputStream(new FileInputStream(file)) ){
			
			String str = dIn.readUTF();
			//int i = dIn.read();
			System.out.println( str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void writeDataFile() {
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream(file)) ){
			
			dout.writeUTF("Hello Java Developer !");
			
		//	dout.write(20);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
