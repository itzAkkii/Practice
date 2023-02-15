package com.Zlast;

class shape {
	 public void draw()
	 {
		 System.out.println("Shape");
	 }
}
public class square extends shape{

	@Override
	public void draw() {
		super.draw();
		System.out.println("Square");
	}

	public static void main(String[] args) {
		
		square s = new square();
		s.draw();
	}
}
