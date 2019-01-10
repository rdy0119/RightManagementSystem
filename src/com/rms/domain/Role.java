/**
 * 
 */
package com.rms.domain;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
    private int rid;
    private String rname;
    private String des;
	public Role(String rname, String des) {
		this.rname = rname;
		this.des = des;
	}
	public Role(int rid,String rname, String des) {
		this.rid=rid;
		this.rname = rname;
		this.des = des;
	}
	public Role() {
		super();
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}
    
    
}
