package utils;

public class Utils {

	static {
		System.setProperty("line.separator", "---------------------------------------------------------------");
	}

	public static String compare(Object obj1, Object obj2) {
		if (obj1 == obj2)
			return "Shallow Copied";
		else
			return "Deep Copied";
	}

	public static void print(String prefix, Object object) {
		System.out.println(prefix + ": " + object);
	}

	public static void seperator() {
		System.out.println(System.getProperty("line.separator"));
	}

}
