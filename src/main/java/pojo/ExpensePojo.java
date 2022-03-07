package pojo;

public class ExpensePojo {

	private int expenseId;
	private String expenseEmp;
	private double expenseAmount;
	private String expenseReason;
	private String expenseTime;
	private String expenseAdmin;
	private String expenseStatus;
	
	
	
	public ExpensePojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ExpensePojo(int expenseId, String expenseEmp, double expenseAmount, String expenseReason, String expenseTime,
			String expenseAdmin, String expenseStatus) {
		super();
		this.expenseId = expenseId;
		this.expenseEmp = expenseEmp;
		this.expenseAmount = expenseAmount;
		this.expenseReason = expenseReason;
		this.expenseTime = expenseTime;
		this.expenseAdmin = expenseAdmin;
		this.expenseStatus = expenseStatus;
	}


	public int getExpenseId() {
		return expenseId;
	}


	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}


	public String getExpenseEmp() {
		return expenseEmp;
	}


	public void setExpenseEmp(String expenseEmp) {
		this.expenseEmp = expenseEmp;
	}


	public double getExpenseAmount() {
		return expenseAmount;
	}


	public void setExpenseAmount(double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}


	public String getExpenseReason() {
		return expenseReason;
	}


	public void setExpenseReason(String expenseReason) {
		this.expenseReason = expenseReason;
	}


	public String getExpenseTime() {
		return expenseTime;
	}


	public void setExpenseTime(String expenseTime) {
		this.expenseTime = expenseTime;
	}


	public String getExpenseAdmin() {
		return expenseAdmin;
	}


	public void setExpenseAdmin(String expenseAdmin) {
		this.expenseAdmin = expenseAdmin;
	}


	public String getExpenseStatus() {
		return expenseStatus;
	}


	public void setExpenseStatus(String expenseStatus) {
		this.expenseStatus = expenseStatus;
	}


	@Override
	public String toString() {
		return "ExpensePojo [expenseId=" + expenseId + ", expenseEmp=" + expenseEmp + ", expenseAmount=" + expenseAmount
				+ ", expenseReason=" + expenseReason + ", expenseTime=" + expenseTime + ", expenseAdmin=" + expenseAdmin
				+ ", expenseStatus=" + expenseStatus + "]";
	}
	
	
	
	
}
