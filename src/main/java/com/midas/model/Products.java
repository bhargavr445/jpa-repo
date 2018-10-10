package com.midas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="products", catalog = "ownproject")
@XmlRootElement
public class Products {
	@Id
	private int prd_id;
	private String prd_name;
	private float prd_price;
	private int cat_id;
	
	Products(){
		
	}
	
	public int getPrd_id() {
		return prd_id;
	}
	public void setPrd_id(int prd_id) {
		this.prd_id = prd_id;
	}
	public String getPrd_name() {
		return prd_name;
	}
	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}
	public float getPrd_price() {
		return prd_price;
	}
	public void setPrd_price(float prd_price) {
		this.prd_price = prd_price;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	@Override
	public String toString() {
		return "Products [prd_id=" + prd_id + ", prd_name=" + prd_name + ", prd_price=" + prd_price + ", cat_id="
				+ cat_id + "]";
	}
	
	
}
