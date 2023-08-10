package attribute;

public class Bus {
	private int busCode;
	private String busLicense;
	private String busType;
	private String busStatus;
	private String startTime;

	public Bus(int busCode, String busLicense, String busType, String busStatus, String startTime) {
		this.busCode = busCode;
		this.busLicense = busLicense;
		this.busType = busType;
		this.busStatus = busStatus;
		this.startTime = startTime;
	}

	public Bus() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public int getBusCode() {
		return busCode;
	}

	public String getBusLicense() {
		return busLicense;
	}

	public String getBusType() {
		return busType;
	}

	public String getBusStatus() {
		return busStatus;
	}

	public String getStartTime() {
		return startTime;
	}
}
