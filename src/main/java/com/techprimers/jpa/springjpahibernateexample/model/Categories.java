package com.techprimers.jpa.springjpahibernateexample.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="categories", catalog = "ownproject")
@ApiModel(description = "Categories Description")
public class Categories {
	@Id
	@ApiModelProperty(notes = "cai_id must be integer")
	private int cat_id;
	private String cat_name;
	private String cat_description;
//	private List<Products> products;
	
	Categories(){
		
	}
	
	

//	public List<Products> getProducts() {
//		return products;
//	}
//
//
//
//	public void setProducts(List<Products> products) {
//		this.products = products;
//	}



	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	public String getCat_description() {
		return cat_description;
	}

	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}



	@Override
	public String toString() {
		return "Categories [cat_id=" + cat_id + ", cat_name=" + cat_name + ", cat_description=" + cat_description + "]";
	}



	


	

}
