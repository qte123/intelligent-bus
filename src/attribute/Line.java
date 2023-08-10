package attribute;

public class Line {
	private int lineCode;
	private String lineName;
	private String status;
	private String startLineTime;
	private String direction;

	public Line(int lineCode, String lineName, String status, String startLineTime, String direction) {
		this.lineCode = lineCode;
		this.lineName = lineName;
		this.status = status;
		this.startLineTime = startLineTime;
		this.direction = direction;
	}

	public Line() {

	}

	public int getLineCode() {
		return lineCode;
	}

	public String getLineName() {
		return lineName;
	}

	public String getStatus() {
		return status;
	}

	public String getStartLineTime() {
		return startLineTime;
	}

	public String getDirection() {
		return direction;
	}
}
