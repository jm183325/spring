package spring;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
	private static Map<String,Car> cars=new HashMap<String,Car>();
	static  {
		cars.put("aa", new Car("xiaohuang",13));
		cars.put("bb", new Car("honghong",12));
	}
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
