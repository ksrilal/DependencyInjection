package com.ksril;

public class B {
	A a;
	
	public B(A a) {
		System.out.println("B ");
		this.a = a;
		try {
			a.show();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This is caled Dependency Injection.");
		}
	}
}	
