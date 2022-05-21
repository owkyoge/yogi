package com.example.pogo;

import java.math.BigDecimal;
import java.sql.Date;

public class Wallet {

	private int id;
	private Long accNo;
	private String accName;
	private BigDecimal amt;
	private String isActive;
	private String createdBy;
	private Long creadtedDated;

	public Wallet() {

	}

	public Wallet(int id, Long accNo, String accName, BigDecimal amt, String isActive, String createdBy,
			Long creadtedDated) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.accName = accName;
		this.amt = amt;
		this.isActive = isActive;
		this.createdBy = createdBy;
		this.creadtedDated = creadtedDated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Long getCreadtedDated() {
		return creadtedDated;
	}

	public void setCreadtedDated(Long creadtedDated) {
		this.creadtedDated = creadtedDated;
	}

	

}
