package com.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;

public class TestResourceBundling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("myspringconfig.xml");
		System.out.println("Choose language of your choice");
		System.out.println("1. Marathi \n2. USA English \n 3. UK English(GB)\n4. Chineses\nchoice:");
		int choice=sc.nextInt();
		String m1=null,m2=null,m3=null,m4=null;
		Locale locale=null;
		MessageSource ms=(MessageSource) ctx.getBean("messageSource");
		switch(choice){
		case 1->{
			locale=new Locale("marathi","IN");
			System.out.println("Language : "+locale.getLanguage()+" Country : "+locale.getCountry());
		}
		case 2->{
			locale=Locale.US;
			System.out.println("Language : "+locale.getLanguage()+" Country : "+locale.getCountry());
		}
		case 3->{
			locale=Locale.UK;
			System.out.println("Language : "+locale.getLanguage()+" Country : "+locale.getCountry());
		}
		case 4->{
			locale=Locale.SIMPLIFIED_CHINESE;
			System.out.println("Language : "+locale.getLanguage()+" Country : "+locale.getCountry());
		}
		default->{
			locale=Locale.JAPANESE;
			System.out.println("Language : "+locale.getLanguage()+" Country : "+locale.getCountry());
		}
		
		
		}
		m1=ms.getMessage("msg.pay", null,locale);
		m2=ms.getMessage("msg.welcome", new String[] {"Kishori"},locale);
		m3=ms.getMessage("msg.data", null,locale);
		m4=ms.getMessage("msg.currency", null,locale);
		System.out.println("Pay "+m1);
		System.out.println("Welcome "+m2);
		System.out.println("Data "+m3 );
		double billamt=sc.nextDouble();
        System.out.println("You enetred "+billamt + m4);
		

	}

}
