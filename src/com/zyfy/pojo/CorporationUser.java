package com.zyfy.pojo;
/**
 * @author matthew
 * TB_CORPORATION_USER 企业用用户表
 */
public class CorporationUser {
	private String BUSICODE;
	private String LEGALPERSONID;
	private String NAME;
	private String ORGCODE;
	private String SHORTNAME;
	private String TAXCODE;
	private String TYPE;
	private String USER_ID;
	private String CATEGORY;
	private int RTPO;
	public String getBUSICODE() {
		return BUSICODE;
	}
	public void setBUSICODE(String bUSICODE) {
		BUSICODE = bUSICODE;
	}
	public String getLEGALPERSONID() {
		return LEGALPERSONID;
	}
	public void setLEGALPERSONID(String lEGALPERSONID) {
		LEGALPERSONID = lEGALPERSONID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getORGCODE() {
		return ORGCODE;
	}
	public void setORGCODE(String oRGCODE) {
		ORGCODE = oRGCODE;
	}
	public String getSHORTNAME() {
		return SHORTNAME;
	}
	public void setSHORTNAME(String sHORTNAME) {
		SHORTNAME = sHORTNAME;
	}
	public String getTAXCODE() {
		return TAXCODE;
	}
	public void setTAXCODE(String tAXCODE) {
		TAXCODE = tAXCODE;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getCATEGORY() {
		return CATEGORY;
	}
	public void setCATEGORY(String cATEGORY) {
		CATEGORY = cATEGORY;
	}
	public int getRTPO() {
		return RTPO;
	}
	public void setRTPO(int rTPO) {
		RTPO = rTPO;
	}
	public CorporationUser(String bUSICODE, String lEGALPERSONID, String nAME, String oRGCODE, String sHORTNAME,
			String tAXCODE, String tYPE, String uSER_ID, String cATEGORY, int rTPO) {
		BUSICODE = bUSICODE;
		LEGALPERSONID = lEGALPERSONID;
		NAME = nAME;
		ORGCODE = oRGCODE;
		SHORTNAME = sHORTNAME;
		TAXCODE = tAXCODE;
		TYPE = tYPE;
		USER_ID = uSER_ID;
		CATEGORY = cATEGORY;
		RTPO = rTPO;
	}
	public CorporationUser() {
	}
	
}
