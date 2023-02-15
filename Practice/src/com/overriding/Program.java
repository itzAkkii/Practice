package com.overriding;
class Animal {
	
	public void eat() {
		System.out.println("All animals are eat veg & non-veg ");
	}
}

class Deer extends Animal{
	
	public void eat() {
		super.eat();
		System.out.println("Deer are eat only veg ");
	}
}
public class Program {

	public static void main(String[] args) {
		
		Deer d = new Deer();
		d.eat();
	}
}
