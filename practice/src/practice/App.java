package practice;

public final class App implements One, Two{

	private static void method1(String user) {
		System.out.println("In String: " + user);
	}
	
	private static void method1(Integer user) {
		System.out.println("In Innteger: " + user);
	}
	
	public static void main(String args[]) {
		One one = new App();
		Two two = new App();
		
		System.out.println("From One: " + one.method(5));
		System.out.println("From Two: " + two.method(10));
		
		String str1 = "One";
		String str2 = "One";
		String str3 = new String("One");
		String str4 = new String("One");
		System.out.println("str1.equals(str2) is: " + str1.equals(str2));
		System.out.println("str1.equals(str3) is: " + str1.equals(str3)) ;
		System.out.println("str1.equals(str4) is: " + str1.equals(str4)) ;
		System.out.println("str3.equals(str4) is: " + str3.equals(str4)) ;

		if (str1==str3) {
			System.out.println("true");
		} else {
			System.out.println("false");
			System.out.println("str1.hashCode(): " + str1.hashCode());
			System.out.println("str3.hashCode(): " + str3.hashCode());
		}
		
		if (str3 == str4) {
			System.out.println("objects equal true");
			System.out.println("str3.hashCode(): " + str3.hashCode());
			System.out.println("str4.hashCode(): " + str4.hashCode());
		} else {
			System.out.println("objects equal false");
			System.out.println("str3.hashCode(): " + str3.hashCode());
			System.out.println("str4.hashCode(): " + str4.hashCode());
		}
		
	}

	@Override
	public int method(int val) {

		return val;
	}

}
