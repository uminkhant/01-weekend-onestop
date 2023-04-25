package com.jdc.mkt.filter_demo;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/admin/*")
public class HelloFilter  implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		HttpServletRequest req = (HttpServletRequest) request;	
		String path = req.getServletPath();
		
		if(path.equals("/admin/admin")) {
			System.out.println("admin");
			chain.doFilter(request, response);
		}else {
			System.out.println("other");
			req.getServletContext().getRequestDispatcher("/other.jsp").forward(request, response);
		}
			
		}
		
	

}





