package Java�߼����181902.ʵ��3;

public class User {
	private String ID;
	private String name;
	private String password;
	
	public User() {
		super();
	}

	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	@Override
	public String toString() {
		return "UserInfo [ID=" + ID + ", name=" + name + ", password=" + password + "]";
	}


}
