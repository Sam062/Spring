package base;

import java.util.List;

public class SpringBean {
	private int empId;
	private List<String> prjs;
	public SpringBean() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public List<String> getPrjs() {
		return prjs;
	}
	public void setPrjs(List<String> prjs) {
		this.prjs = prjs;
	}
	@Override
	public String toString() {
		return "SpringBean [empId=" + empId + ", prjs=" + prjs + "]";
	}
	
	

}
