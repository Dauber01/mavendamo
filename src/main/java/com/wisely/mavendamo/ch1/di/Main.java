package com.wisely.mavendamo.ch1.di;

import java.util.Date;
import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		/*AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = 
				context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		context.close();*/
		//Date date = new Date("2018/1/01");
		//System.out.println(System.currentTimeMillis() - date.getTime());
		for(int i = 0;i<50;i++){

			Random rand = new Random();

			int randNum = rand.nextInt(50);

			System.out.println(randNum );

			}
		
	}
	
}
