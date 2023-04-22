package com.jdc.mkt.srv_tst;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		value ="/inform",
		initParams = {
				@WebInitParam(name = "first",value = "first param"),
				@WebInitParam(name="second",value = "second param")
		}
)
public class InformationServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//var name  =  req.getParameter("name");
		//var age = req.getParameter("age");
		
		var names  =  req.getParameterNames();
		
		while(names.hasMoreElements()) {
			var n = req.getParameter(names.nextElement());
		//	System.out.println(n);
		}
		
		
		// http protocol
	//	System.out.println(req.getServletPath());
	//	System.out.println(req.getContextPath());
		
		
		//get servlet information
		
		var params = getInitParameterNames();
		
		while(params.hasMoreElements()) {
			var nam =  params.nextElement();
			var param = getInitParameter(nam);
			System.out.println(String.format(" name : %s \t value : %s ", nam,param));
		}
		
	}

}
