package com.lus.dawm.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.lus.dawm.db.MySqlDB;
import com.lus.dawm.model.Utilisateur;

public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("get");
		try {
			new MySqlDB();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		HttpSession session = req.getSession();
		if (username.equals("admin") && pwd.equals("root")) {
			Utilisateur u = new Utilisateur(1,username, pwd);
			session.setAttribute("user", u);
			resp.sendRedirect(req.getContextPath() + "/admin/produit/ajouter.jsp");
		} else {
			resp.getWriter().print("donnees err !!");
		}
	}
}
