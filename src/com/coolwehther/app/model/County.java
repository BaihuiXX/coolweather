package com.coolwehther.app.model;

public class County {
	private int id;
	private String countyName;
	private String countyCode;
	private int cityId;

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		id = _id;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String _countyName) {
		countyName = _countyName;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String _countyCode) {
		countyCode = _countyCode;
	}
	
	public int getCityId() {
		return cityId;
	}
	
	public void setCityId(int _cityId) {
		cityId = _cityId;
	}
}
