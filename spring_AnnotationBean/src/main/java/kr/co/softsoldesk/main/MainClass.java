package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;


public class MainClass {

	public static void main(String[] args) {
		System.out.println("===================XML======================");
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1=ctx1.getBean("xml1", TestBean1.class);
		System.out.println("xml1.data1 : "+xml1.getData1());
		System.out.println("xml1.data2 : "+xml1.getData2());
		System.out.println("xml1.data3 : "+xml1.getData3());
		System.out.println("xml1.data4 : "+xml1.getData4());
		System.out.println("xml1.data5 : "+xml1.getData5());
		System.out.println("xml1.data6 : "+xml1.getData6());
		
		TestBean2 xml2=ctx1.getBean("xml2", TestBean2.class);
		System.out.println("xml1.data1 : "+xml2.getData1());
		System.out.println("xml1.data2 : "+xml2.getData2());
		System.out.println("xml1.data3 : "+xml2.getData3());
		System.out.println("xml1.data4 : "+xml2.getData4());
		
		ctx1.close();
		
		System.out.println("===================Java====================");
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext();
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1.data1 : "+java1.getData1());
		System.out.println("java1.data2 : "+java1.getData2());
		System.out.println("java1.data3 : "+java1.getData3());
		System.out.println("java1.data4 : "+java1.getData4());
		System.out.println("java1.data5 : "+java1.getData5());
		System.out.println("java1.data6 : "+java1.getData6());

		ctx2.close();
	}//main

}
