package com.coolwehther.app.model;

public class City {
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		id = _id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String _cityName) {
		cityName = _cityName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String _cityCode) {
		cityCode = _cityCode;
	}
	
	public int getProvinceId() {
		return provinceId;
	}
	
	public void setProvinceId(int _provinceId) {
		provinceId = _provinceId;
	}
}
