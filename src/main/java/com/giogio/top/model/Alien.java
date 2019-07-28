package com.giogio.top.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue
	private int  aid;
	private String aname;
	private  String lang;

	@Override
	public String toString() {
		return "Alien{" +
				"aid=" + aid +
				", aname='" + aname + '\'' +
				", lang='" + lang + '\'' +
				'}';
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}
