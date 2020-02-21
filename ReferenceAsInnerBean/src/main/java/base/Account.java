package base;

public class Account {
	private int aid;
	private String acode;
	private User usr;
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
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", acode=" + acode + ", usr=" + usr + "]";
	}
	
}
