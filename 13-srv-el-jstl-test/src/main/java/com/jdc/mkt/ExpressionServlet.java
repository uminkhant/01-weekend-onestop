package com.jdc.mkt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/expression")
public class ExpressionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Map<String, String> map = new HashMap<>();
		map.put("a", "letter of a");
		map.put("b", "letter of b");
		map.put("c", "letter of c");
		
		req.setAttribute("person", new Person("Aung Aung", 20));
		req.setAttribute("list", Arrays.asList("Java","JSP","JSTL"));
		req.setAttribute("map", map);
		
		req.getRequestDispatcher("exressiontest.jsp").forward(req, resp);
	}

}
