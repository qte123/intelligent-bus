package attribute;

public class Scheduling {
	private int code;
	private int lineCode;
	private String busLicense;
	private String tcNumber;
	private String tcTime;
	private int userCode;
	private int startStation;
	private int endStation;

	public Scheduling(int code, int lineCode,String busLicense, String tcNumber, String tcTime, int userCode, int startStation,
			int endStation) {
		this.code=code;
		this.lineCode=lineCode;
		this.busLicense=busLicense;
		this.tcNumber=tcNumber;
		this.tcTime=tcTime;
		this.userCode=userCode;
		this.startStation=startStation;
		this.endStation=endStation;
	}
	public Scheduling() {
		
	}
	public int getCode() {
		return code;
	}
	public int getLineCode() {
		return lineCode;
	}
	public String getBusLicense() {
		return busLicense;
	}
	public String getTcNumber() {
		return tcNumber;
	}
	public String getTcTime() {
		return tcTime;
	}
	public int getUserCode() {
		return userCode;
	}
	public int getStartStation() {
		return startStation;
	}
	public int getEndStation() {
		return endStation;
	}
}
