package com.midas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="subscription")
public class Subscription {
	@Id
	@NotNull
	private String name;
	@NotNull
	@Size(min=2, max=2)
	private String state;
	@NotNull
	@Size(min=2, max=4)
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
