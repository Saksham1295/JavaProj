package com.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewed
 */
@WebServlet("/Viewed")
public class Viewed extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Connection con;
     ResultSet rs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Viewed() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		try{
		con = new Connect().ret();
		rs = new Queryget(con).ret();
		} catch(Exception e) {
			System.out.println(e);
		}
		pw.println("<h1>Success</h1>");
		pw.println("<br>");
		pw.println("<Table><tr><th>ID</th><th>Name</th><th>Age</th><th>Salary</th></tr>");
		try{
		while(rs.next()) {
			pw.println("<tr><td>"+rs.getInt(1)+"<tr><td>"+rs.getString(2)+"<td><td>"+rs.getInt(3)+"</td><td>"+rs.getDouble(4)+"</td></tr>");
		}
		} catch(Exception e) {
			System.out.println(e);
		}
		pw.println("</Table>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
