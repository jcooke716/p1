package pojo;

public class PendingPojo {
	
	private int pendingId;
	private int pendingRequest;
	private double pendingAmount;
	private String pendReason;
	private String pendRequestTime;
	private int pendResponse;
	private String pendRequestStatus;
	public PendingPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PendingPojo(int pendingId, int pendingRequest, double pendingAmount, String pendReason,
			String pendRequestTime, int pendResponse, String pendRequestStatus) {
		super();
		this.pendingId = pendingId;
		this.pendingRequest = pendingRequest;
		this.pendingAmount = pendingAmount;
		this.pendReason = pendReason;
		this.pendRequestTime = pendRequestTime;
		this.pendResponse = pendResponse;
		this.pendRequestStatus = pendRequestStatus;
	}
	public int getPendingId() {
		return pendingId;
	}
	public void setPendingId(int pendingId) {
		this.pendingId = pendingId;
	}
	public int getPendingRequest() {
		return pendingRequest;
	}
	public void setPendingRequest(int pendingRequest) {
		this.pendingRequest = pendingRequest;
	}
	public double getPendingAmount() {
		return pendingAmount;
	}
	public void setPendingAmount(double pendingAmount) {
		this.pendingAmount = pendingAmount;
	}
	public String getPendReason() {
		return pendReason;
	}
	public void setPendReason(String pendReason) {
		this.pendReason = pendReason;
	}
	public String getPendRequestTime() {
		return pendRequestTime;
	}
	public void setPendRequestTime(String pendRequestTime) {
		this.pendRequestTime = pendRequestTime;
	}
	public int getPendResponse() {
		return pendResponse;
	}
	public void setPendResponse(int pendResponse) {
		this.pendResponse = pendResponse;
	}
	public String getPendRequestStatus() {
		return pendRequestStatus;
	}
	public void setPendRequestStatus(String pendRequestStatus) {
		this.pendRequestStatus = pendRequestStatus;
	}
	
	@Override
	public String toString() {
		return "PendingPojo [pendingId=" + pendingId + ", pendingRequest=" + pendingRequest + ", pendingAmount="
				+ pendingAmount + ", pendReason=" + pendReason + ", pendRequestTime=" + pendRequestTime
				+ ", pendResponse=" + pendResponse + ", pendRequestStatus=" + pendRequestStatus + "]";
	}
	
	

}
