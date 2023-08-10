package attribute;

public class Station {
	private int stationCode;
	private String stationName;
	private String longitude;
	private String latitude;
	private String region;
	private String street;

	public Station(int stationCode, String stationName, String longitude, String latitude, String region,
			String street) {
		this.stationCode = stationCode;
		this.stationName = stationName;
		this.longitude = longitude;
		this.latitude = latitude;
		this.region = region;
		this.street = street;
	}
	public Station() {
		
	}
	public int getStationCode() {
		return stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getrRegion() {
		return region;
	}
	public String getStreet() {
		return street;
	}
}
