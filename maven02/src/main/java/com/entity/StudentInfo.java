package com.entity;

public class StudentInfo {

	private Integer sid;
	private String sname;
	private Integer sage;
	private String sphoneNp;
	private String ssex;

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	public String getSphoneNp() {
		return sphoneNp;
	}
	public void setSphoneNp(String sphoneNp) {
		this.sphoneNp = sphoneNp;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}


	public StudentInfo(Integer sid, String sname, Integer sage, String sphoneNp, String ssex) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sphoneNp = sphoneNp;
		this.ssex = ssex;

	}
	public StudentInfo() {
		super();
	}
	@Override
	public String toString() {
		return "StudentInfo [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", sphoneNp=" + sphoneNp + ", ssex="
				+ ssex + "]";
	}
	
}
