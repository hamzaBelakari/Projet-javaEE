package com.lus.dawm.main;

import java.sql.SQLException;

import com.lus.dawm.db.MySqlDB;
import com.lus.dawm.model.Utilisateur;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
          MySqlDB db = new MySqlDB();
          
          Utilisateur utilisateur = db.findUtilisateur("admin", "root");
          
          System.out.println(utilisateur);
	}

}
