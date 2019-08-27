package spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
	private String name;
	private String age;
	private String adress;
	private List<Dog> dogs;
	private Map<String ,Big> bigs;
	private Car car;
	private Properties properties;
}
