package com.oc.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oc.beans.Operation;

@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

    public Calculatrice() {
        super();
    }
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response); 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int nombre1, nombre2 = 0;
		
		if(request.getParameter("nombre1") == "")
			nombre1 = 0;
		else
			nombre1 = Integer.parseInt(request.getParameter("nombre1"));
		if(request.getParameter("nombre2") == "")
			nombre2 = 0;
		else
			nombre2 = Integer.parseInt(request.getParameter("nombre2"));
		
		Operation operation = new Operation(nombre1, request.getParameter("operateur"), nombre2);
		request.setAttribute("operation", operation);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	
    }
	
}
