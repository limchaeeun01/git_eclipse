package mvc.util;

public class View {
	private String responseJSP;
	private boolean isFlag;
	
	public View() {
		super();
	}
	public View(String responseJSP, boolean isFlag) {
		super();
		this.responseJSP = responseJSP;
		this.isFlag = isFlag;
	}
	
	public String getResponseJSP() {
		return responseJSP;
	}
	public void setResponseJSP(String responseJSP) {
		this.responseJSP = responseJSP;
	}
	public boolean isFlag() {
		return isFlag;
	}
	public void setFlag(boolean isFlag) {
		this.isFlag = isFlag;
	}
	
}
