package com.lus.dawm.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lus.dawm.model.Utilisateur;

public class MySqlDB {

	Connection con;
	public MySqlDB() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eshop","root","");
		System.out.println("connexion etablie");
	}	
	
	public Utilisateur findUtilisateur(String username, String password) throws SQLException
	{
		String sql = "select * from utilisateur where username = ? and pwd = ?";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		
		ResultSet rs = preparedStatement.executeQuery();
		
		Utilisateur utilisateur = null;
		
		if (rs.next())
		{
			utilisateur = new Utilisateur(rs.getInt("id"),rs.getString("username"), rs.getString("pwd"));
		}
		
		return utilisateur;
		
	}
}
