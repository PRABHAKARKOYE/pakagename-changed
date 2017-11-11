package com.dineshonjava.sdjpa.dto;

import java.util.Date;


public class EmployeeDto {
	
	
	private Integer pkId;
	
	
	private String firstName;
	
	
	private String lname;
	
	public Integer getPkId() {
		return pkId;
	}

	public void setPkId(Integer pkId) {
		this.pkId = pkId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	private String email;
	
	private Integer pinCode;
	
	private Date birthDate;
	
	private Boolean flag;

}
