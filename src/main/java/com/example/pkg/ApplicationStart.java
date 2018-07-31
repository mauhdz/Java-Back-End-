package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
//		Point p= (Point)applicationContext.getBean("point");
//		System.out.println(p.getX());
//		System.out.println(p.getY());
//		
//		Calculator c= (Calculator) applicationContext.getBean("calc");
//		System.out.println(c.add());
//		System.out.println(c.substract());
//		System.out.println(c.divide());
//		System.out.println(c.multiply());
		
		Animal animal= (Animal) applicationContext.getBean("dog");
		System.out.println("Species: "+ animal.getSpeciesName());
		System.out.println("Height: "+ animal.getSize().getHeight());
		System.out.println("Weight: "+ animal.getSize().getWeight());	
		System.out.println("Color: "+ animal.getColor().getColorName());
		//For idref which validates if the bean wit that name exists
		//System.out.println("Validator: "+ animal.getValidator());

		
		
		
//		Vector3 v= (Vector3)applicationContext.getBean("vector");
//		System.out.println(v.getX());
//		System.out.println(v.getY());
//		System.out.println(v.getZ());

	}

}
