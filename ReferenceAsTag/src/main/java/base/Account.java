package base;

public class Account {
	private int aid;
	private String acode;
	private User userObj;
	public Account() {
		super();
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAcode() {
		return acode;
	}
	public void setAcode(String acode) {
		this.acode = acode;
	}
	public User getUserObj() {
		return userObj;
	}
	public void setUserObj(User userObj) {
		this.userObj = userObj;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", acode=" + acode + ", userObj=" + userObj + "]";
	}
	

}
