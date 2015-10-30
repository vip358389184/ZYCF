package com.zyfy.pojo;

import java.sql.Date;

/**
 * TB_LOANREQUEST 借款申请信息表
 * @author matthew
 *
 */
public class LoanRequest {
		private String ID;
		private int AMOUNT;//借款量
		private String DESCRIPTION;//备注
		private String EMPLOYEEID;//职工？
		private String GUARANTEEINFO;
		private int HIDDEN;
		private String METHOD;
		private String MORTGAGEINFO;
		private int MORTGAGED;
		private String PURPOSE;
		private int RATE;
		private String RISKINFO;
		private String SERIAL;
		private String SOURCE;
		private String STATUS;
		private Date TIMESUBMIT;
		private String TITLE;
		private String USER_ID;
		private int DAYS;
		private int MONTHS;
		private int YEARS;
		private String GUARANTEE_ID;//保证人ID
		private String GUARANTEE_REALM;
		private int MAXAMOUNT;
		private int MAXTIMES;
		private int MAXTOTALAMOUNT;
		private int MINAMOUNT;
		private int STEPAMOUNT;
		private String REVIEWCOMMENT;
		private String CLIENTPRIV;
		private String GUARANTYSTYLE;
		private String PRODUCTID;
		private String ENTITYID;
		private String REALM;
		private String DISPLAYUSERID;
		private String PARENTID;
		private int PUREREQUEST;
		private String AUTOABLE;
		private int DAYOFREPAYMENT;
		private int DAYSOFYEAR;
		private String REPAYMENTPERIOD;
		private String CODE;
		private Date VALUEDATE;
		private String RECEIVER_ID;
		private String RECEIVER_REALM;
		private Date DUEDATE;
		private int AUTORATIO;
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
		public String getDESCRIPTION() {
			return DESCRIPTION;
		}
		public void setDESCRIPTION(String dESCRIPTION) {
			DESCRIPTION = dESCRIPTION;
		}
		public String getEMPLOYEEID() {
			return EMPLOYEEID;
		}
		public void setEMPLOYEEID(String eMPLOYEEID) {
			EMPLOYEEID = eMPLOYEEID;
		}
		public String getGUARANTEEINFO() {
			return GUARANTEEINFO;
		}
		public void setGUARANTEEINFO(String gUARANTEEINFO) {
			GUARANTEEINFO = gUARANTEEINFO;
		}
		public int getHIDDEN() {
			return HIDDEN;
		}
		public void setHIDDEN(int hIDDEN) {
			HIDDEN = hIDDEN;
		}
		public String getMETHOD() {
			return METHOD;
		}
		public void setMETHOD(String mETHOD) {
			METHOD = mETHOD;
		}
		public String getMORTGAGEINFO() {
			return MORTGAGEINFO;
		}
		public void setMORTGAGEINFO(String mORTGAGEINFO) {
			MORTGAGEINFO = mORTGAGEINFO;
		}
		public int getMORTGAGED() {
			return MORTGAGED;
		}
		public void setMORTGAGED(int mORTGAGED) {
			MORTGAGED = mORTGAGED;
		}
		public String getPURPOSE() {
			return PURPOSE;
		}
		public void setPURPOSE(String pURPOSE) {
			PURPOSE = pURPOSE;
		}
		public int getRATE() {
			return RATE;
		}
		public void setRATE(int rATE) {
			RATE = rATE;
		}
		public String getRISKINFO() {
			return RISKINFO;
		}
		public void setRISKINFO(String rISKINFO) {
			RISKINFO = rISKINFO;
		}
		public String getSERIAL() {
			return SERIAL;
		}
		public void setSERIAL(String sERIAL) {
			SERIAL = sERIAL;
		}
		public String getSOURCE() {
			return SOURCE;
		}
		public void setSOURCE(String sOURCE) {
			SOURCE = sOURCE;
		}
		public String getSTATUS() {
			return STATUS;
		}
		public void setSTATUS(String sTATUS) {
			STATUS = sTATUS;
		}
		public Date getTIMESUBMIT() {
			return TIMESUBMIT;
		}
		public void setTIMESUBMIT(Date tIMESUBMIT) {
			TIMESUBMIT = tIMESUBMIT;
		}
		public String getTITLE() {
			return TITLE;
		}
		public void setTITLE(String tITLE) {
			TITLE = tITLE;
		}
		public String getUSER_ID() {
			return USER_ID;
		}
		public void setUSER_ID(String uSER_ID) {
			USER_ID = uSER_ID;
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
		public String getGUARANTEE_ID() {
			return GUARANTEE_ID;
		}
		public void setGUARANTEE_ID(String gUARANTEE_ID) {
			GUARANTEE_ID = gUARANTEE_ID;
		}
		public String getGUARANTEE_REALM() {
			return GUARANTEE_REALM;
		}
		public void setGUARANTEE_REALM(String gUARANTEE_REALM) {
			GUARANTEE_REALM = gUARANTEE_REALM;
		}
		public int getMAXAMOUNT() {
			return MAXAMOUNT;
		}
		public void setMAXAMOUNT(int mAXAMOUNT) {
			MAXAMOUNT = mAXAMOUNT;
		}
		public int getMAXTIMES() {
			return MAXTIMES;
		}
		public void setMAXTIMES(int mAXTIMES) {
			MAXTIMES = mAXTIMES;
		}
		public int getMAXTOTALAMOUNT() {
			return MAXTOTALAMOUNT;
		}
		public void setMAXTOTALAMOUNT(int mAXTOTALAMOUNT) {
			MAXTOTALAMOUNT = mAXTOTALAMOUNT;
		}
		public int getMINAMOUNT() {
			return MINAMOUNT;
		}
		public void setMINAMOUNT(int mINAMOUNT) {
			MINAMOUNT = mINAMOUNT;
		}
		public int getSTEPAMOUNT() {
			return STEPAMOUNT;
		}
		public void setSTEPAMOUNT(int sTEPAMOUNT) {
			STEPAMOUNT = sTEPAMOUNT;
		}
		public String getREVIEWCOMMENT() {
			return REVIEWCOMMENT;
		}
		public void setREVIEWCOMMENT(String rEVIEWCOMMENT) {
			REVIEWCOMMENT = rEVIEWCOMMENT;
		}
		public String getCLIENTPRIV() {
			return CLIENTPRIV;
		}
		public void setCLIENTPRIV(String cLIENTPRIV) {
			CLIENTPRIV = cLIENTPRIV;
		}
		public String getGUARANTYSTYLE() {
			return GUARANTYSTYLE;
		}
		public void setGUARANTYSTYLE(String gUARANTYSTYLE) {
			GUARANTYSTYLE = gUARANTYSTYLE;
		}
		public String getPRODUCTID() {
			return PRODUCTID;
		}
		public void setPRODUCTID(String pRODUCTID) {
			PRODUCTID = pRODUCTID;
		}
		public String getENTITYID() {
			return ENTITYID;
		}
		public void setENTITYID(String eNTITYID) {
			ENTITYID = eNTITYID;
		}
		public String getREALM() {
			return REALM;
		}
		public void setREALM(String rEALM) {
			REALM = rEALM;
		}
		public String getDISPLAYUSERID() {
			return DISPLAYUSERID;
		}
		public void setDISPLAYUSERID(String dISPLAYUSERID) {
			DISPLAYUSERID = dISPLAYUSERID;
		}
		public String getPARENTID() {
			return PARENTID;
		}
		public void setPARENTID(String pARENTID) {
			PARENTID = pARENTID;
		}
		public int getPUREREQUEST() {
			return PUREREQUEST;
		}
		public void setPUREREQUEST(int pUREREQUEST) {
			PUREREQUEST = pUREREQUEST;
		}
		public String getAUTOABLE() {
			return AUTOABLE;
		}
		public void setAUTOABLE(String aUTOABLE) {
			AUTOABLE = aUTOABLE;
		}
		public int getDAYOFREPAYMENT() {
			return DAYOFREPAYMENT;
		}
		public void setDAYOFREPAYMENT(int dAYOFREPAYMENT) {
			DAYOFREPAYMENT = dAYOFREPAYMENT;
		}
		public int getDAYSOFYEAR() {
			return DAYSOFYEAR;
		}
		public void setDAYSOFYEAR(int dAYSOFYEAR) {
			DAYSOFYEAR = dAYSOFYEAR;
		}
		public String getREPAYMENTPERIOD() {
			return REPAYMENTPERIOD;
		}
		public void setREPAYMENTPERIOD(String rEPAYMENTPERIOD) {
			REPAYMENTPERIOD = rEPAYMENTPERIOD;
		}
		public String getCODE() {
			return CODE;
		}
		public void setCODE(String cODE) {
			CODE = cODE;
		}
		public Date getVALUEDATE() {
			return VALUEDATE;
		}
		public void setVALUEDATE(Date vALUEDATE) {
			VALUEDATE = vALUEDATE;
		}
		public String getRECEIVER_ID() {
			return RECEIVER_ID;
		}
		public void setRECEIVER_ID(String rECEIVER_ID) {
			RECEIVER_ID = rECEIVER_ID;
		}
		public String getRECEIVER_REALM() {
			return RECEIVER_REALM;
		}
		public void setRECEIVER_REALM(String rECEIVER_REALM) {
			RECEIVER_REALM = rECEIVER_REALM;
		}
		public Date getDUEDATE() {
			return DUEDATE;
		}
		public void setDUEDATE(Date dUEDATE) {
			DUEDATE = dUEDATE;
		}
		public int getAUTORATIO() {
			return AUTORATIO;
		}
		public void setAUTORATIO(int aUTORATIO) {
			AUTORATIO = aUTORATIO;
		}
		public LoanRequest(String iD, int aMOUNT, String dESCRIPTION, String eMPLOYEEID, String gUARANTEEINFO,
				int hIDDEN, String mETHOD, String mORTGAGEINFO, int mORTGAGED, String pURPOSE, int rATE,
				String rISKINFO, String sERIAL, String sOURCE, String sTATUS, Date tIMESUBMIT, String tITLE,
				String uSER_ID, int dAYS, int mONTHS, int yEARS, String gUARANTEE_ID, String gUARANTEE_REALM,
				int mAXAMOUNT, int mAXTIMES, int mAXTOTALAMOUNT, int mINAMOUNT, int sTEPAMOUNT, String rEVIEWCOMMENT,
				String cLIENTPRIV, String gUARANTYSTYLE, String pRODUCTID, String eNTITYID, String rEALM,
				String dISPLAYUSERID, String pARENTID, int pUREREQUEST, String aUTOABLE, int dAYOFREPAYMENT,
				int dAYSOFYEAR, String rEPAYMENTPERIOD, String cODE, Date vALUEDATE, String rECEIVER_ID,
				String rECEIVER_REALM, Date dUEDATE, int aUTORATIO) {
			ID = iD;
			AMOUNT = aMOUNT;
			DESCRIPTION = dESCRIPTION;
			EMPLOYEEID = eMPLOYEEID;
			GUARANTEEINFO = gUARANTEEINFO;
			HIDDEN = hIDDEN;
			METHOD = mETHOD;
			MORTGAGEINFO = mORTGAGEINFO;
			MORTGAGED = mORTGAGED;
			PURPOSE = pURPOSE;
			RATE = rATE;
			RISKINFO = rISKINFO;
			SERIAL = sERIAL;
			SOURCE = sOURCE;
			STATUS = sTATUS;
			TIMESUBMIT = tIMESUBMIT;
			TITLE = tITLE;
			USER_ID = uSER_ID;
			DAYS = dAYS;
			MONTHS = mONTHS;
			YEARS = yEARS;
			GUARANTEE_ID = gUARANTEE_ID;
			GUARANTEE_REALM = gUARANTEE_REALM;
			MAXAMOUNT = mAXAMOUNT;
			MAXTIMES = mAXTIMES;
			MAXTOTALAMOUNT = mAXTOTALAMOUNT;
			MINAMOUNT = mINAMOUNT;
			STEPAMOUNT = sTEPAMOUNT;
			REVIEWCOMMENT = rEVIEWCOMMENT;
			CLIENTPRIV = cLIENTPRIV;
			GUARANTYSTYLE = gUARANTYSTYLE;
			PRODUCTID = pRODUCTID;
			ENTITYID = eNTITYID;
			REALM = rEALM;
			DISPLAYUSERID = dISPLAYUSERID;
			PARENTID = pARENTID;
			PUREREQUEST = pUREREQUEST;
			AUTOABLE = aUTOABLE;
			DAYOFREPAYMENT = dAYOFREPAYMENT;
			DAYSOFYEAR = dAYSOFYEAR;
			REPAYMENTPERIOD = rEPAYMENTPERIOD;
			CODE = cODE;
			VALUEDATE = vALUEDATE;
			RECEIVER_ID = rECEIVER_ID;
			RECEIVER_REALM = rECEIVER_REALM;
			DUEDATE = dUEDATE;
			AUTORATIO = aUTORATIO;
		}
		public LoanRequest() {
		}
		@Override
		public String toString() {
			return "LoanRequest [ID=" + ID + ", AMOUNT=" + AMOUNT + ", DESCRIPTION=" + DESCRIPTION + ", EMPLOYEEID="
					+ EMPLOYEEID + ", GUARANTEEINFO=" + GUARANTEEINFO + ", HIDDEN=" + HIDDEN + ", METHOD=" + METHOD
					+ ", MORTGAGEINFO=" + MORTGAGEINFO + ", MORTGAGED=" + MORTGAGED + ", PURPOSE=" + PURPOSE + ", RATE="
					+ RATE + ", RISKINFO=" + RISKINFO + ", SERIAL=" + SERIAL + ", SOURCE=" + SOURCE + ", STATUS="
					+ STATUS + ", TIMESUBMIT=" + TIMESUBMIT + ", TITLE=" + TITLE + ", USER_ID=" + USER_ID + ", DAYS="
					+ DAYS + ", MONTHS=" + MONTHS + ", YEARS=" + YEARS + ", GUARANTEE_ID=" + GUARANTEE_ID
					+ ", GUARANTEE_REALM=" + GUARANTEE_REALM + ", MAXAMOUNT=" + MAXAMOUNT + ", MAXTIMES=" + MAXTIMES
					+ ", MAXTOTALAMOUNT=" + MAXTOTALAMOUNT + ", MINAMOUNT=" + MINAMOUNT + ", STEPAMOUNT=" + STEPAMOUNT
					+ ", REVIEWCOMMENT=" + REVIEWCOMMENT + ", CLIENTPRIV=" + CLIENTPRIV + ", GUARANTYSTYLE="
					+ GUARANTYSTYLE + ", PRODUCTID=" + PRODUCTID + ", ENTITYID=" + ENTITYID + ", REALM=" + REALM
					+ ", DISPLAYUSERID=" + DISPLAYUSERID + ", PARENTID=" + PARENTID + ", PUREREQUEST=" + PUREREQUEST
					+ ", AUTOABLE=" + AUTOABLE + ", DAYOFREPAYMENT=" + DAYOFREPAYMENT + ", DAYSOFYEAR=" + DAYSOFYEAR
					+ ", REPAYMENTPERIOD=" + REPAYMENTPERIOD + ", CODE=" + CODE + ", VALUEDATE=" + VALUEDATE
					+ ", RECEIVER_ID=" + RECEIVER_ID + ", RECEIVER_REALM=" + RECEIVER_REALM + ", DUEDATE=" + DUEDATE
					+ ", AUTORATIO=" + AUTORATIO + "]";
		}
		
		
		
}
