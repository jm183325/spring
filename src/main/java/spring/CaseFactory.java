package spring;

import java.util.HashMap;
import java.util.Map;

public class CaseFactory {
	private  Map<String,Car> cars=new HashMap<String,Car>();
	CaseFactory()  {
		cars.put("aa", new Car("xiaohuang",13));
		cars.put("bb", new Car("honghong",12));
	}
	public  Car getCar(String name) {
		return cars.get(name);
	}
}
