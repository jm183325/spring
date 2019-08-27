package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreate {
	public static void main(String[] args) {
		//创建springIOC容器
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过id方式从IOC容器获取bean实例
		HelloWord h=(HelloWord) ac.getBean("helloWord2");
		//从IOC容器获取bean实例
		//HelloWord h=(HelloWord) ac.getBean(HelloWord.class);
		System.out.println("helloWord2===="+h.toString());
		
		HelloWord h3=(HelloWord) ac.getBean("helloWord3");
		System.out.println("helloWord3===="+h3.toString());
		Person p=(Person) ac.getBean("person");
		System.out.println("person===="+p);
		Person p2=(Person) ac.getBean("person2");
		System.out.println("person2===="+p2);
		
		Person p3=(Person) ac.getBean("person3");
		System.out.println("person3===="+p3);
		Person p4=(Person) ac.getBean("person4");
		System.out.println("person4===="+p4);
		
		Person p5=(Person) ac.getBean("person5");
		System.out.println("person5===="+p5);
		Person pPrototype=(Person) ac.getBean("person");
		System.out.println(pPrototype==p);
		
		Person p6=(Person) ac.getBean("person6");
		System.out.println("person6===="+p6);
		Car staticFactory=(Car) ac.getBean("staticFactory");
		System.out.println("staticFactory===="+staticFactory);
		Car caseFactoryCar=(Car) ac.getBean("caseFactoryCar");
		System.out.println("caseFactoryCar===="+caseFactoryCar);
		Car factoryBeanCar=(Car) ac.getBean("factoryBeanCar");
		System.out.println("factoryBeanCar===="+factoryBeanCar);
	}
	
}
