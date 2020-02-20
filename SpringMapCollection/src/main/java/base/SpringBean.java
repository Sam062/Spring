package base;

import java.util.Map;

public class SpringBean {
	private int id;
	private Map<String,Integer> map1;
	private Map<String,Integer> map2;
	private Map<String,Integer> map3;
	private Map<String,Integer> map4;
	
	public SpringBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, Integer> getMap1() {
		return map1;
	}
	public void setMap1(Map<String, Integer> map1) {
		this.map1 = map1;
	}
	public Map<String, Integer> getMap2() {
		return map2;
	}
	public void setMap2(Map<String, Integer> map2) {
		this.map2 = map2;
	}
	public Map<String, Integer> getMap3() {
		return map3;
	}
	public void setMap3(Map<String, Integer> map3) {
		this.map3 = map3;
	}
	public Map<String, Integer> getMap4() {
		return map4;
	}
	public void setMap4(Map<String, Integer> map4) {
		this.map4 = map4;
	}
	@Override
	public String toString() {
		return "SpringBean [id=" + id + ", map1=" + map1 + ", map2=" + map2 + ", map3=" + map3 + ", map4=" + map4 + "]";
	}
	
	

	
}
