package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
		
		Animal animal= (Animal) applicationContext.getBean("tom");
		System.out.println("Species: "+ animal.getSpeciesName());
		System.out.println("Height: "+ animal.getSize().getHeight());
		System.out.println("Weight: "+ animal.getSize().getWeight());	
		System.out.println("Color: "+ animal.getColor().getColorName());
		
		BeanValidator val = (BeanValidator) applicationContext.getBean("validatorBean");
		//This is from method toString on BeanValidator
		System.out.println(val);
		
		Animal animal2= (Animal) applicationContext.getBean("mouse");
		System.out.println(animal2.getNames());
		System.out.println(animal2.getFood());
		
		Animal animal3= (Animal) applicationContext.getBean("dog");
		System.out.println(animal3.getColor().getColorName());		
	}
}
