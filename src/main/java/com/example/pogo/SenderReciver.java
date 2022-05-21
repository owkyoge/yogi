package com.example.pogo;

import java.math.BigDecimal;

public class SenderReciver {

	private Long senderAccNo;
	private Long receiverAccNo;
	private BigDecimal amt;

	SenderReciver() {

	}

	public SenderReciver(Long senderAccNo, Long receiverAccNo, BigDecimal amt) {
		super();
		this.senderAccNo = senderAccNo;
		this.receiverAccNo = receiverAccNo;
		this.amt = amt;
	}

	public Long getSenderAccNo() {
		return senderAccNo;
	}

	public void setSenderAccNo(Long senderAccNo) {
		this.senderAccNo = senderAccNo;
	}

	public Long getReceiverAccNo() {
		return receiverAccNo;
	}

	public void setReceiverAccNo(Long receiverAccNo) {
		this.receiverAccNo = receiverAccNo;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	
	
	
}
