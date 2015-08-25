package com.zyfy.pojo;

public class Loan {
	
	private String ID;
	private int AMOUNT;
	private String AUTOSPLITTED;
	private int BID_AMOUNT;
	private int BID_NUMBER;
	private String METHOD;
	private int MORTGAGED;
	private int ORDINAL;
	private int RATE;
	private int REWARDED;
	private String STATUS;
	private String TIMECLEARED;
	private String TIMEFINISHED;
	private String TIMEOPEN;
	private int TIMEOUT;
	private String TIMESETTLED;
	private String TITLE;
	private int DAYS;
	private int MONTHS;
	private int YEARS;
	private String REQUEST_ID;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(int aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getAUTOSPLITTED() {
		return AUTOSPLITTED;
	}
	public void setAUTOSPLITTED(String aUTOSPLITTED) {
		AUTOSPLITTED = aUTOSPLITTED;
	}
	public int getBID_AMOUNT() {
		return BID_AMOUNT;
	}
	public void setBID_AMOUNT(int bID_AMOUNT) {
		BID_AMOUNT = bID_AMOUNT;
	}
	public int getBID_NUMBER() {
		return BID_NUMBER;
	}
	public void setBID_NUMBER(int bID_NUMBER) {
		BID_NUMBER = bID_NUMBER;
	}
	public String getMETHOD() {
		return METHOD;
	}
	public void setMETHOD(String mETHOD) {
		METHOD = mETHOD;
	}
	public int getMORTGAGED() {
		return MORTGAGED;
	}
	public void setMORTGAGED(int mORTGAGED) {
		MORTGAGED = mORTGAGED;
	}
	public int getORDINAL() {
		return ORDINAL;
	}
	public void setORDINAL(int oRDINAL) {
		ORDINAL = oRDINAL;
	}
	public int getRATE() {
		return RATE;
	}
	public void setRATE(int rATE) {
		RATE = rATE;
	}
	public int getREWARDED() {
		return REWARDED;
	}
	public void setREWARDED(int rEWARDED) {
		REWARDED = rEWARDED;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getTIMECLEARED() {
		return TIMECLEARED;
	}
	public void setTIMECLEARED(String tIMECLEARED) {
		TIMECLEARED = tIMECLEARED;
	}
	public String getTIMEFINISHED() {
		return TIMEFINISHED;
	}
	public void setTIMEFINISHED(String tIMEFINISHED) {
		TIMEFINISHED = tIMEFINISHED;
	}
	public String getTIMEOPEN() {
		return TIMEOPEN;
	}
	public void setTIMEOPEN(String tIMEOPEN) {
		TIMEOPEN = tIMEOPEN;
	}
	public int getTIMEOUT() {
		return TIMEOUT;
	}
	public void setTIMEOUT(int tIMEOUT) {
		TIMEOUT = tIMEOUT;
	}
	public String getTIMESETTLED() {
		return TIMESETTLED;
	}
	public void setTIMESETTLED(String tIMESETTLED) {
		TIMESETTLED = tIMESETTLED;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public int getDAYS() {
		return DAYS;
	}
	public void setDAYS(int dAYS) {
		DAYS = dAYS;
	}
	public int getMONTHS() {
		return MONTHS;
	}
	public void setMONTHS(int mONTHS) {
		MONTHS = mONTHS;
	}
	public int getYEARS() {
		return YEARS;
	}
	public void setYEARS(int yEARS) {
		YEARS = yEARS;
	}
	public String getREQUEST_ID() {
		return REQUEST_ID;
	}
	public void setREQUEST_ID(String rEQUEST_ID) {
		REQUEST_ID = rEQUEST_ID;
	}
	public Loan(String id, int AMOUNT, String aUTOSPLITTED, int bID_AMOUNT, int bID_NUMBER, String mETHOD,
			int mORTGAGED, int oRDINAL, int rATE, int rEWARDED, String sTATUS, String tIMECLEARED, String tIMEFINISHED,
			String tIMEOPEN, int tIMEOUT, String tIMESETTLED, String tITLE, int dAYS, int mONTHS, int yEARS,
			String rEQUEST_ID) {
		this.ID = id;
		this.AMOUNT = AMOUNT;
		AUTOSPLITTED = aUTOSPLITTED;
		BID_AMOUNT = bID_AMOUNT;
		BID_NUMBER = bID_NUMBER;
		METHOD = mETHOD;
		MORTGAGED = mORTGAGED;
		ORDINAL = oRDINAL;
		RATE = rATE;
		REWARDED = rEWARDED;
		STATUS = sTATUS;
		TIMECLEARED = tIMECLEARED;
		TIMEFINISHED = tIMEFINISHED;
		TIMEOPEN = tIMEOPEN;
		TIMEOUT = tIMEOUT;
		TIMESETTLED = tIMESETTLED;
		TITLE = tITLE;
		DAYS = dAYS;
		MONTHS = mONTHS;
		YEARS = yEARS;
		REQUEST_ID = rEQUEST_ID;
	}
	public Loan() {
	}
	@Override
	public String toString() {
		return "Loan [ID=" + ID + ", AMOUNT=" + AMOUNT + ", AUTOSPLITTED=" + AUTOSPLITTED + ", BID_AMOUNT=" + BID_AMOUNT
				+ ", BID_NUMBER=" + BID_NUMBER + ", METHOD=" + METHOD + ", MORTGAGED=" + MORTGAGED + ", ORDINAL="
				+ ORDINAL + ", RATE=" + RATE + ", REWARDED=" + REWARDED + ", STATUS=" + STATUS + ", TIMECLEARED="
				+ TIMECLEARED + ", TIMEFINISHED=" + TIMEFINISHED + ", TIMEOPEN=" + TIMEOPEN + ", TIMEOUT=" + TIMEOUT
				+ ", TIMESETTLED=" + TIMESETTLED + ", TITLE=" + TITLE + ", DAYS=" + DAYS + ", MONTHS=" + MONTHS
				+ ", YEARS=" + YEARS + ", REQUEST_ID=" + REQUEST_ID + "]";
	}
	
	
	
	
	

}
