package com.stu.pkg;


class employ{
	
	int id=10;
	String name="fayez";
	public void display() {
		System.out.println("id=10");
		System.out.println("name=fayez");
	}
	
}


public class member {
	public static void main(String args[]) {
		employ obj=new employ();
		obj.display();
	}
	

}
