package com.jdc.mkt.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, ClassNotFoundException {

		Hello h = new Hello();
		//h.useFieldAnno("ss");
		h.useMethodAnno();
		//h.userFieldAnnoWithArray();
		
	}

}

class Hello {
	
	@MyAnno("Sandar")
	@MyAnno("MyoThu")
	private String name;

	@MyStaff
	private String staff;
	
	@MyAnnos(value = {
		@MyAnno("Soe san"),
		@MyAnno("pp")
	})
	private String names;

	@MyMethodAnno(name = "Su Su")
	void useMethodAnno() throws  NoSuchMethodException, SecurityException, ClassNotFoundException {

		Method m = Hello.class.getDeclaredMethod("useMethodAnno");
		MyMethodAnno anno = m.getAnnotation(MyMethodAnno.class);

		if (null != anno)
			System.out.println(anno.name());

	}

	void useFieldAnno(String name) throws NoSuchFieldException, SecurityException {

		Field f = Hello.class.getDeclaredField("name");
		MyAnno anno = f.getAnnotation(MyAnno.class);

		if (null != anno)
			System.out.println(anno.value());

	}

	void userFieldAnnoWithArray() {
		try {
			Field f = Hello.class.getDeclaredField("staff");
			MyStaff anno = f.getAnnotation(MyStaff.class);

			if (null != anno) {
				
				String[] strs = anno.staff();
				
				if(strs.length >0) {
					for(String s :anno.staff()) {
						System.out.println(s);
					}
				}else {
					System.out.println("There is no staff");
				}
				
				
			}
				
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	
}

@Repeatable( value = MyAnnos.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
@interface MyAnno {

	String value() default "No Name";
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MyStaff {
	String[] staff() default {};
}

@Retention(RetentionPolicy.RUNTIME)
@Target( ElementType.FIELD)
@interface MyAnnos{
	
	MyAnno[] value() default {};
}

@Retention(RetentionPolicy.RUNTIME)
@Target( ElementType.METHOD)
@interface MyMethodAnno{
	String name() default "no name";
}










