/**
 * 
 */
package com.dineshonjava.sdjpa.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dinesh.Rajput
 *
 */
@Entity
@Table(name = "PRABHATEST")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer pkId;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lname;
	@Column(name="emialid")
	private String email;
	@Column(name="pincodeid")
	private Integer pinCode;
	@Column(name="dateofbirth")
	private Date birthDate;
	@Column(name="status")
	private Boolean flag;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
