package com.jdc.mkt;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JstlTestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("persons", Arrays.asList(
				new Person("Sanda",20),
				new Person("Thida", 40),
				new Person("Wanna", 21)));
		
	//	req.setAttribute("persons", null);
		
		getServletContext().getRequestDispatcher("/jsttest.jsp").forward(req, resp);
	}

}
