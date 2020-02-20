package base;

import java.util.Set;

public class SpringBean {
	
	private int id;
	private String code;
	private Set<String> ord;
	public SpringBean() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Set<String> getOrd() {
		return ord;
	}
	public void setOrd(Set<String> ord) {
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "SpringBean [id=" + id + ", code=" + code + ", ord=" + ord + "]";
	}
	
	

}
