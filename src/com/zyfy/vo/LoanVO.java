package com.zyfy.vo;

public class LoanVO {
	private String id; //项目id,唯一
	private String name; //项目全名称
	private String img_url;//项目图片地址
	private String borrow_url;//项目地址
	private String borrower;//借款人名称
	private String charges;//收费说明
	private int guarant_mode; //0 无担保 1 本息 2 本金担保
	private String guarantors;//第三方担保时，需提供担保方名称，否则置为空
	private float account;//募资总额，单位元
	private float account_yes;//已募资金额，单位元
	private float borrow_time;//借款时长
	private int borrow_time_unit;//借款时长单位，1为天，2为月，3为年
	private int tender_num;//已投资人数量（随进度更新）
	private String progress;//投资完成进度（<=1，4位有效数字），已经募集的金额除以计划募集金额
	private String publish_time;//发布时间
	private String start_time;//募资开始时间
	private String end_time;//募资结束时间（完成募资时必须，未满标则置为0）
	private String repay_start_time;//还款开始时间（完成募资时必须，未满标则置为0）
	private String repay_end_time;//还款结束时间（完成募资时必须，未满标则置为0）
	private int status;//标状态{-1:流标，0：筹款中，1:已满标，2：已开始还款,3:预发布，4:还款完成，5:逾期}
	private int borrow_type;//1 抵押借款 2 信用借款  3 质押借款 4 第三方担保 5 净值标
	private String pay_type;//1 按月付息 到期还本 2 按季付息，到期还本3 每月等额本息  4 到期还本息 5 按周等额本息还款 6按周付息，到期还本 7提前付息，到期一次性还本 注：本字段指单个标的的还款方式，单种还款方式请用数值，如：1；多种还款方式请用英文’,’组合，如1,2,3；其余还款方式请沟通确认
	private float apr;//年化收益率，精确到小数点2位
	private float start_price;//起投金额，单位元
	private float step_price;//追加投入金额，单位元，若只要求投资额度大于起始金额，则本字段设置为0
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getBorrow_url() {
		return borrow_url;
	}
	public void setBorrow_url(String borrow_url) {
		this.borrow_url = borrow_url;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public int getGuarant_mode() {
		return guarant_mode;
	}
	public void setGuarant_mode(int guarant_mode) {
		this.guarant_mode = guarant_mode;
	}
	public String getGuarantors() {
		return guarantors;
	}
	public void setGuarantors(String guarantors) {
		this.guarantors = guarantors;
	}
	public float getAccount() {
		return account;
	}
	public void setAccount(float account) {
		this.account = account;
	}
	public float getAccount_yes() {
		return account_yes;
	}
	public void setAccount_yes(float account_yes) {
		this.account_yes = account_yes;
	}
	public float getBorrow_time() {
		return borrow_time;
	}
	public void setBorrow_time(float borrow_time) {
		this.borrow_time = borrow_time;
	}
	public int getBorrow_time_unit() {
		return borrow_time_unit;
	}
	public void setBorrow_time_unit(int borrow_time_unit) {
		this.borrow_time_unit = borrow_time_unit;
	}
	public int getTender_num() {
		return tender_num;
	}
	public void setTender_num(int tender_num) {
		this.tender_num = tender_num;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public String getPublish_time() {
		return publish_time;
	}
	public void setPublish_time(String publish_time) {
		this.publish_time = publish_time;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getRepay_start_time() {
		return repay_start_time;
	}
	public void setRepay_start_time(String repay_start_time) {
		this.repay_start_time = repay_start_time;
	}
	public String getRepay_end_time() {
		return repay_end_time;
	}
	public void setRepay_end_time(String repay_end_time) {
		this.repay_end_time = repay_end_time;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBorrow_type() {
		return borrow_type;
	}
	public void setBorrow_type(int borrow_type) {
		this.borrow_type = borrow_type;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public float getApr() {
		return apr;
	}
	public void setApr(float apr) {
		this.apr = apr;
	}
	public float getStart_price() {
		return start_price;
	}
	public void setStart_price(float start_price) {
		this.start_price = start_price;
	}
	public float getStep_price() {
		return step_price;
	}
	public void setStep_price(float step_price) {
		this.step_price = step_price;
	}
	public LoanVO(String id, String name, String img_url, String borrow_url, String borrower, String charges,
			int guarant_mode, String guarantors, float account, float account_yes, float borrow_time,
			int borrow_time_unit, int tender_num, String progress, String publish_time, String start_time,
			String end_time, String repay_start_time, String repay_end_time, int status, int borrow_type,
			String pay_type, float apr, float start_price, float step_price) {
		this.id = id;
		this.name = name;
		this.img_url = img_url;
		this.borrow_url = borrow_url;
		this.borrower = borrower;
		this.charges = charges;
		this.guarant_mode = guarant_mode;
		this.guarantors = guarantors;
		this.account = account;
		this.account_yes = account_yes;
		this.borrow_time = borrow_time;
		this.borrow_time_unit = borrow_time_unit;
		this.tender_num = tender_num;
		this.progress = progress;
		this.publish_time = publish_time;
		this.start_time = start_time;
		this.end_time = end_time;
		this.repay_start_time = repay_start_time;
		this.repay_end_time = repay_end_time;
		this.status = status;
		this.borrow_type = borrow_type;
		this.pay_type = pay_type;
		this.apr = apr;
		this.start_price = start_price;
		this.step_price = step_price;
	}
	public LoanVO() {}
	@Override
	public String toString() {
		return "LoanVO [id=" + id + ", name=" + name + ", img_url=" + img_url + ", borrow_url=" + borrow_url
				+ ", borrower=" + borrower + ", charges=" + charges + ", guarant_mode=" + guarant_mode + ", guarantors="
				+ guarantors + ", account=" + account + ", account_yes=" + account_yes + ", borrow_time=" + borrow_time
				+ ", borrow_time_unit=" + borrow_time_unit + ", tender_num=" + tender_num + ", progress=" + progress
				+ ", publish_time=" + publish_time + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", repay_start_time=" + repay_start_time + ", repay_end_time=" + repay_end_time + ", status=" + status
				+ ", borrow_type=" + borrow_type + ", pay_type=" + pay_type + ", apr=" + apr + ", start_price="
				+ start_price + ", step_price=" + step_price + "]";
	}
}
