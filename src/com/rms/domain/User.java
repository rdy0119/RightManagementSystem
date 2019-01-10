/**
 * 
 */
package com.rms.domain;

/**
 * @author Administrator
 *
 */

public class User {
 private int uid;
 private String uname;
 private String upass;
 private String trueName;

	/**
	 * @param uname
	 * @param upass
	 * @param trueName
	 */
	public User(String uname, String upass, String trueName) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.trueName = trueName;
	}
	

	public User() {
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getUpass() {
		return upass;
	}


	public void setUpass(String upass) {
		this.upass = upass;
	}


	public String getTrueName() {
		return trueName;
	}


	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	 

	@Override
	public String toString() {
		return this.getUid()+","+this.getUname()+","+this.getUpass()+","+this.getTrueName();
	}
}
