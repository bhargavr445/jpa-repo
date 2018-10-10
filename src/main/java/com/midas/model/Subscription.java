package com.midas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscription {
	@Id
	private String name;
	private String state;
	private String period;
	private String userName;
	private String modification;
	
	
	
	public Subscription() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getModification() {
		return modification;
	}
	public void setModification(String modification) {
		this.modification = modification;
	}
	@Override
	public String toString() {
		return "Subscription [name=" + name + ", state=" + state + ", period=" + period + ", userName=" + userName
				+ ", modification=" + modification + "]";
	}
	
	

}
