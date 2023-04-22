package com.jdc.mkt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BufferedTest {

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
		try (BufferedReader in = new BufferedReader(new FileReader(file))) {

		String str = null;
		
		while((str =  in.readLine()) != null) {
			
			System.out.println(str);
		}
			

			byte[] array = { 72, 101, 108, 108, 111 };
			System.out.println(new String(array, StandardCharsets.UTF_8));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void writeFile() {
		try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {

			out.write("Hello Java Developer");
			out.append("We are going to learn about java");
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
