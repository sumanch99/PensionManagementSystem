/**
 * 
 */
package com.cognizant.gpd.model;

/**
 * @author USER
 *
 */
public class Bank {
	
	private String bankName;
    private String accountNo;
    private String bankType;
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @return the bankType
	 */
	public String getBankType() {
		return bankType;
	}
	/**
	 * @param bankType the bankType to set
	 */
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	/**
	 * @param bankName
	 * @param accountNo
	 * @param bankType
	 */
	public Bank(String bankName, String accountNo, String bankType) {
		super();
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.bankType = bankType;
	}
    
    
	
}
