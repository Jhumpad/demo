package maccess;

import nit.v.*;

public class DemoProg1 {
	public static void main(String[] args) {
		System.out.println("==User defined class object===");
		User u = new User("jhumpa", "j@gmail.com", 8789234710L);
		System.out.println(u.toString());
		System.out.println("===WrapperClass object===");
		Integer ob1=new Integer(121);
		System.out.println(ob1.toString());
		System.out.println("===String object===");
		String ob2=new String("NIT-HYD");
		System.out.println(ob2.toString());
	}
}
