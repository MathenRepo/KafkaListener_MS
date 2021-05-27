package com.department.micro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TradeLogListener")
public class TradeListenerVO {
	
	public TradeListenerVO() {
		super();
	}
	public TradeListenerVO(long tradeID, String tradePayload) {
		super();
		this.tradeID = tradeID;
		this.tradePayload = tradePayload;
	}
	@Override
	public String toString() {
		return "TradeVO [tradeID=" + tradeID + ", tradePayload=" + tradePayload + "]";
	}
	public long getTradeID() {
		return tradeID;
	}
	public void setTradeID(long tradeID) {
		this.tradeID = tradeID;
	}
	public String getTradePayload() {
		return tradePayload;
	}
	public void setTradePayload(String tradePayload) {
		this.tradePayload = tradePayload;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long tradeID;
	public String tradePayload;
	

}
