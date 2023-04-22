package com.jdc.mkt;

import static org.assertj.core.api.Assertions.catchException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ByteStreamTest  {

	static Data data;
	static File file;

	@BeforeAll
	static void createFile() throws IOException {
		file = new File("test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	@Test
	void byteTest() {
		writeFile();
		readFile();
	}

	void readFile() {
		List<Byte> list = new ArrayList<>();
		try (FileInputStream in = new FileInputStream(file)) {

			int i = 0;
			
			while((i = in.read())!= -1) {
				System.out.println(i);
				list.add((byte) i);
			}
		
			byte[] array = {72,101,108,108,111};
			System.out.println(new String( array,StandardCharsets.UTF_8) );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void writeFile() {
	try (FileOutputStream out = new FileOutputStream(file)) {

		byte[] hello = "Hello".getBytes();
		System.out.println(hello);
		out.write(hello);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
