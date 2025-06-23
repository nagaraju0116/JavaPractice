package com.packages.demo.app;

public final class A {
	
	//if not public for obj then it not access in other package
	// public int num=3;
	
	//accessed by diff packages of subclasses
	 protected int num=3;
	 
	 public final void show() {
			System.out.println(num);
		}
		

	

}
