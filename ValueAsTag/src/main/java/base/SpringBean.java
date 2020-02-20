package base;

public class SpringBean {
	private int id;
	private String name;
	private double fee;
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
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "SpringBean [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	
}
