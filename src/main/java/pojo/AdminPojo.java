package pojo;

public class AdminPojo {
	
	private int adminId;
	private String adminPassword;
	private String adminFirstName;
	private String adminLastName;
	private long adminConatct;
	private String adminEmail;
	private String adminAddress;
	
	
	public AdminPojo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdminPojo(int adminId, String adminPassword, String adminFirstName, String adminLastName, long adminConatct,
			String adminEmail, String adminAddress) {
		super();
		this.adminId = adminId;
		this.adminPassword = adminPassword;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminConatct = adminConatct;
		this.adminEmail = adminEmail;
		this.adminAddress = adminAddress;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	public String getAdminFirstName() {
		return adminFirstName;
	}


	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}


	public String getAdminLastName() {
		return adminLastName;
	}


	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}


	public long getAdminConatct() {
		return adminConatct;
	}


	public void setAdminConatct(long adminConatct) {
		this.adminConatct = adminConatct;
	}


	public String getAdminEmail() {
		return adminEmail;
	}


	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}


	public String getAdminAddress() {
		return adminAddress;
	}


	public void setAdminAddress(String adminAddress) {
		this.adminAddress = adminAddress;
	}


	@Override
	public String toString() {
		return "AdminPojo [adminId=" + adminId + ", adminPassword=" + adminPassword + ", adminFirstName="
				+ adminFirstName + ", adminLastName=" + adminLastName + ", adminConatct=" + adminConatct
				+ ", adminEmail=" + adminEmail + ", adminAddress=" + adminAddress + "]";
	}
	
	
	
	

}
