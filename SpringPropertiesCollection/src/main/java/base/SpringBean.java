package base;

import java.util.Properties;

public class SpringBean {

	private int id;
	private String name;
	private Properties prop;
	public SpringBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "SpringBean [id=" + id + ", name=" + name + ", prop=" + prop + "]";
	}
	
}
