package com.swjd.bean;

public class House {
	private int letId;
	private String letName;
	private String letType;
	private int letPrice;
	private String letPhone;
	private String letAddress;

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public House(String letName, String letType, int letPrice, String letPhone, String letAddress) {
		super();
		this.letName = letName;
		this.letType = letType;
		this.letPrice = letPrice;
		this.letPhone = letPhone;
		this.letAddress = letAddress;
	}

	public House(int letId, String letName, String letType, int letPrice, String letPhone, String letAddress) {
		super();
		this.letId = letId;
		this.letName = letName;
		this.letType = letType;
		this.letPrice = letPrice;
		this.letPhone = letPhone;
		this.letAddress = letAddress;
	}

	public int getLetId() {
		return letId;
	}

	public void setLetId(int letId) {
		this.letId = letId;
	}

	public String getLetName() {
		return letName;
	}

	public void setLetName(String letName) {
		this.letName = letName;
	}

	public String getLetType() {
		return letType;
	}

	public void setLetType(String letType) {
		this.letType = letType;
	}

	public int getLetPrice() {
		return letPrice;
	}

	public void setLetPrice(int letPrice) {
		this.letPrice = letPrice;
	}

	public String getLetPhone() {
		return letPhone;
	}

	public void setLetPhone(String letPhone) {
		this.letPhone = letPhone;
	}

	public String getLetAddress() {
		return letAddress;
	}

	public void setLetAddress(String letAddress) {
		this.letAddress = letAddress;
	}

	@Override
	public String toString() {
		return "House [letId=" + letId + ", letName=" + letName + ", letType=" + letType + ", letPrice=" + letPrice
				+ ", letPhone=" + letPhone + ", letAddress=" + letAddress + "]\n";
	}

}

