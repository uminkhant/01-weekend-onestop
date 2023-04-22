package com.jdc.mkt;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CharacterStreamTest {

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
		try (FileReader in = new FileReader(file)) {

			int i = 0;

			while ((i = in.read()) != -1) {
				System.out.println(i);
				list.add((byte) i);
			}

		//	list.stream().map(m -> m).flatMap(f -> Stream.of(f));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void writeFile() {
		try (FileWriter out = new FileWriter(file)) {

			out.write("Hello");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
