package pojo;

public class FinalPojo {
	
	private int finalId;
	private int finalRequest;
	private double finalAmount;
	private String finalReason;
	private String finalResponseTime;
	private String finalResponse;
	private String finalStatus;
	public FinalPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FinalPojo(int finalId, int finalRequest, double finalAmount, String finalReason, String finalResponseTime,
			String finalResponse, String finalStatus) {
		super();
		this.finalId = finalId;
		this.finalRequest = finalRequest;
		this.finalAmount = finalAmount;
		this.finalReason = finalReason;
		this.finalResponseTime = finalResponseTime;
		this.finalResponse = finalResponse;
		this.finalStatus = finalStatus;
	}
	public int getFinalId() {
		return finalId;
	}
	public void setFinalId(int finalId) {
		this.finalId = finalId;
	}
	public int getFinalRequest() {
		return finalRequest;
	}
	public void setFinalRequest(int finalRequest) {
		this.finalRequest = finalRequest;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
	public String getFinalReason() {
		return finalReason;
	}
	public void setFinalReason(String finalReason) {
		this.finalReason = finalReason;
	}
	public String getFinalResponseTime() {
		return finalResponseTime;
	}
	public void setFinalResponseTime(String finalResponseTime) {
		this.finalResponseTime = finalResponseTime;
	}
	public String getFinalResponse() {
		return finalResponse;
	}
	public void setFinalResponse(String finalResponse) {
		this.finalResponse = finalResponse;
	}
	public String getFinalStatus() {
		return finalStatus;
	}
	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
	}
	
	
	@Override
	public String toString() {
		return "FinalPojo [finalId=" + finalId + ", finalRequest=" + finalRequest + ", finalAmount=" + finalAmount
				+ ", finalReason=" + finalReason + ", finalResponseTime=" + finalResponseTime + ", finalResponse="
				+ finalResponse + ", finalStatus=" + finalStatus + "]";
	}
	
	
	

}
