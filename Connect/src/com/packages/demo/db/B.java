package com.packages.demo.db;

import com.packages.demo.app.A;
//acces modifiers
public class B extends A {
	
	public  void show() {
		//num is a public as sub class of other package by protected modifier
		System.out.println(num);
	}
}



/* 
 *   Acces modifiers
 *  
 *  final method =  modifier
 *  to stop overriding(non-overriding) methods we can use as B show()  and A show() mehtods
 *  
 *  final class
 *  it will stop the inheritance  as A class is final
 *  
 *  final with varaible makes it constant
 *  
 */