package com.jdc.mkt.file_demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fileUpload")
@MultipartConfig
public class UploadFileServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		var part = req.getPart("file");
		List<String> list = new ArrayList<>();
		
		try(var reader = new BufferedReader(new InputStreamReader(part.getInputStream()))){
			
			String str = null;
			while(null != (str = reader.readLine())) {
				list.add(str);
			}
			req.setAttribute("products", list.stream().map(Product::new).toList());
			req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
