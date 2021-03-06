package pojo;

public class EmployeePojo {
	
	private int employeeId;
	private String employeePassword;
	private String employeeFirstName;
	private String employeeLastName;
	private long employeeContact;
	private String employeeEmail;
	private String employeeAddress;
	private int employeeAdmin;
	
	
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeePojo(int employeeId, String employeePassword, String employeeFirstName, String employeeLastName,
			long employeeContact, String employeeEmail, String employeeAddress, int employeeAdmin) {
		super();
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeContact = employeeContact;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
		this.employeeAdmin = employeeAdmin;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeePassword() {
		return employeePassword;
	}


	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}


	public String getEmployeeFirstName() {
		return employeeFirstName;
	}


	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}


	public String getEmployeeLastName() {
		return employeeLastName;
	}


	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}


	public long getEmployeeContact() {
		return employeeContact;
	}


	public void setEmployeeContact(long employeeContact) {
		this.employeeContact = employeeContact;
	}


	public String getEmployeeEmail() {
		return employeeEmail;
	}


	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}


	public String getEmployeeAddress() {
		return employeeAddress;
	}


	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}


	public int getEmployeeAdmin() {
		return employeeAdmin;
	}


	public void setEmployeeAdmin(int employeeAdmin) {
		this.employeeAdmin = employeeAdmin;
	}


	@Override
	public String toString() {
		return "EmployeePojo [employeeId=" + employeeId + ", employeePassword=" + employeePassword
				+ ", employeeFirstName=" + employeeFirstName + ", employeeLastName=" + employeeLastName
				+ ", employeeContact=" + employeeContact + ", employeeEmail=" + employeeEmail + ", employeeAddress="
				+ employeeAddress + ", employeeAdmin=" + employeeAdmin + "]";
	}


	
	

}
