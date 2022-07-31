/**
 * 
 */
package com.cognizant.gpd.model;

import java.util.Date;

/**
 * @author USER
 *
 */


public class Pensioner {
	
	private String aadharNo;
    private String name;
    private Date dob;
    private String panNo;
    private String salary;
    private String allowance;
    private String pensionType;
    private Bank bankDetails;
	
    public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getAllowance() {
		return allowance;
	}
	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public Bank getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(Bank bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	
	
}
