package com.zyfy.vo;

public class ContractModel {
	private String contractNumber;
	private String contractTime;
	private String a_name;
	private String a_cold;
	private String a_userName;
	private String b_name;
	private String b_cold;
	private String b_userName;
	private String d_address;
	private String d_corporation;
	private String use;
	private String amount;
	private String capital;
	private String reat;
	private String startTime;
	private String endTime;
	private String periods;
	private String repayment;
	private String day;
	
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getContractTime() {
		return contractTime;
	}
	public void setContractTime(String contractTime) {
		this.contractTime = contractTime;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_cold() {
		return a_cold;
	}
	public void setA_cold(String a_cold) {
		this.a_cold = a_cold;
	}
	public String getA_userName() {
		return a_userName;
	}
	public void setA_userName(String a_userName) {
		this.a_userName = a_userName;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_cold() {
		return b_cold;
	}
	public void setB_cold(String b_cold) {
		this.b_cold = b_cold;
	}
	public String getB_userName() {
		return b_userName;
	}
	public void setB_userName(String b_userName) {
		this.b_userName = b_userName;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public String getD_corporation() {
		return d_corporation;
	}
	public void setD_corporation(String d_corporation) {
		this.d_corporation = d_corporation;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getReat() {
		return reat;
	}
	public void setReat(String reat) {
		this.reat = reat;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getPeriods() {
		return periods;
	}
	public void setPeriods(String periods) {
		this.periods = periods;
	}
	public String getRepayment() {
		return repayment;
	}
	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public ContractModel(String contractNumber, String contractTime, String a_name, String a_cold, String a_userName,
			String b_name, String b_cold, String b_userName, String d_address, String d_corporation, String use,
			String amount, String capital, String reat, String startTime, String endTime, String periods,
			String repayment, String day) {
		this.contractNumber = contractNumber;
		this.contractTime = contractTime;
		this.a_name = a_name;
		this.a_cold = a_cold;
		this.a_userName = a_userName;
		this.b_name = b_name;
		this.b_cold = b_cold;
		this.b_userName = b_userName;
		this.d_address = d_address;
		this.d_corporation = d_corporation;
		this.use = use;
		this.amount = amount;
		this.capital = capital;
		this.reat = reat;
		this.startTime = startTime;
		this.endTime = endTime;
		this.periods = periods;
		this.repayment = repayment;
		this.day = day;
	}
	
	public ContractModel() {}
	
	@Override
	public String toString() {
		return "ContractModel [contractNumber=" + contractNumber + ", contractTime=" + contractTime + ", a_name="
				+ a_name + ", a_cold=" + a_cold + ", a_userName=" + a_userName + ", b_name=" + b_name + ", b_cold="
				+ b_cold + ", b_userName=" + b_userName + ", d_address=" + d_address + ", d_corporation="
				+ d_corporation + ", use=" + use + ", amount=" + amount + ", capital=" + capital + ", reat=" + reat
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", periods=" + periods + ", repayment="
				+ repayment + ", day=" + day + "]";
	}
	
	
	
	
}
