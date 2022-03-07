package exception;

public class RequestNotFoundException extends Exception {
	
	@Override
	public String getMessage() {
		return "No Requests Found!!";
	}

}
