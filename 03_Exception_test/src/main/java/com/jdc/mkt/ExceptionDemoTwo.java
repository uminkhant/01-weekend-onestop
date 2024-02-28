package com.jdc.mkt;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

public class ExceptionDemoTwo {

	public static void main(String[] args) {

		// try {
		CarFactory cf = new CarFactory();
		// cf.engineComp();
		// cf.wheelComp();
		// cf.customerComp();
		String s = cf.getExceptionMessage();
		System.out.println(s);

//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		}catch (ReflectiveOperationException e) {
//			
//		}	
//		catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}

class CarFactory {

	StringBuffer sb;

	// unchecked exception
	void engineComp() throws NullPointerException {
		sb.append("Hello");
		System.out.println(sb.toString());
	}

	// check Exception
	void wheelComp() throws IOException {

		File f = new File("D:/texts.txt");
		f.createNewFile();

	}

	void customerComp() throws NoSuchMethodException {

	}

	void tryWitchResoucrceTest() {

		try (TestClosed tc = new TestClosed()) {
			
			//fw.close();
			
		} catch (Exception e) {

		}
		
	}

	String getExceptionMessage() {

		try {
			System.out.println("try block");
			return sb.toString();

		} catch (Exception e) {
			System.out.println("catch block");
			return "null reuturn";

		} finally {
			System.out.println("finally");
		}

	}
}

class TestClosed implements Closeable{

	@Override
	public void close() throws IOException {
		
	}}






