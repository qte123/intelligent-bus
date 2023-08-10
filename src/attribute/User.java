package attribute;

public class User {
	private int userCode;
	private String loginName;
	private String password;
	private String name;
	private String phone;
	private String idCard;
	private int role;
	private int driving;
	private String status;

	public User(int userCode, String loginName, String password, String name, String phone, String idCard, int role,
			int driving, String status) {
		this.userCode=userCode;
		this.loginName=loginName;
		this.password=password;
		this.name=name;
		this.phone=phone;
		this.idCard=idCard;
		this.role=role;
		this.driving=driving;
		this.status=status;
	}
	public User() {
		
	}
	public int getUserCode() {
		return userCode;
	}
	public String getLoginName() {
		return loginName;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getIdCard() {
		return idCard;
	}
	public int getRole() {
		return role;
	}
	public int getDriving() {
		return driving;
	}
	public String getStatus() {
		return status;
	}
}
