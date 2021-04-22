package com.lus.dawm.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Panier implements Serializable {

	private List<Produit> produits;
	
	public Panier() {
		this.produits=new ArrayList<Produit>();
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
