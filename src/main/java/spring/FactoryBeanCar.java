package spring;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanCar implements FactoryBean<Car>{

	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("123",67);
	}

	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
