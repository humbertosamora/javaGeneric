package javaGeneric;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;

public class ReflectionCreateObject {
	public static void main(String[] args) {

		listConstructors(Client.class);
		
		Client client = createObject(Client.class, "Samurai");
		
		System.out.println(client);
	
	}

	public static <T> T createObject(Class<T> c, String stringParam) {
		
		try {
			@SuppressWarnings("unchecked")
			Constructor<T>[] ctors = (Constructor<T>[]) c.getConstructors();
			
			if (ctors != null) {
				
				for (Constructor<T> ctor : ctors) {
					if (ctor.toString().indexOf("(java.lang.String)") != -1) {
						T object = ctor.newInstance(stringParam);
						return (T) object;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		throw new InvalidParameterException("The class " + c + " has not a constructor with a String parameter.");
	}
	
	public static <T> void listConstructors(Class<T> c) {
		
		try {
			@SuppressWarnings("unchecked")
			Constructor<T>[] ctors = (Constructor<T>[]) c.getConstructors();
			
			if (ctors != null) {
				
				for (Constructor<T> ctor : ctors) {
					System.out.println(ctor);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}