package com.lus.dawm.model;

import java.io.Serializable;

public class Produit implements Serializable{

	private String designation;
	private double prix;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
}
