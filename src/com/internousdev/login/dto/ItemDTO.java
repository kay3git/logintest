package com.internousdev.login.dto;

public class ItemDTO {
	private String pencil;
	private String eracer;
	private String rulerl;
	private String pen;

	//////////////////////以下、カプセル化
	public String getPencil() {
		return pencil;
	}
	public void setPencil(String pencil) {
		this.pencil = pencil;
	}
	public String getEracer() {
		return eracer;
	}
	public void setEracer(String eracer) {
		this.eracer = eracer;
	}
	public String getRulerl() {
		return rulerl;
	}
	public void setRulerl(String rulerl) {
		this.rulerl = rulerl;
	}
	public String getPen() {
		return pen;
	}
	public void setPen(String pen) {
		this.pen = pen;
	}


}
