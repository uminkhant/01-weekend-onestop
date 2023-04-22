package com.jdc.mkt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

public class ObjectStreamTest {
	
	@Test
	void objectStreamTest() {
		writeObject();
		readObject();
	}

	void writeObject() {
		try(ObjectOutputStream out =
				new ObjectOutputStream(new FileOutputStream("data.obj"))){
			
			Data d = new Data();
			d.setA(20);
			out.writeObject(d);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	void readObject() {
		try(ObjectInputStream in =
				new ObjectInputStream(new FileInputStream("data.obj"))){
			
			Data a = (Data) in.readObject();
			System.err.println(a.getA());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
