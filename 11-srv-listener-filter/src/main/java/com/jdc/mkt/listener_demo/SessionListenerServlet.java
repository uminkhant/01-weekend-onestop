package com.jdc.mkt.listener_demo;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListenerServlet implements HttpSessionListener, HttpSessionAttributeListener {


	public void sessionCreated(HttpSessionEvent se)  { 
		System.out.println("Session Created");
    }

	public void sessionDestroyed(HttpSessionEvent se)  { 
		System.out.println("Session Destroyed");
    }

	
	public void attributeRemoved(HttpSessionBindingEvent event)  { 
		System.out.println("Attribute Removed");
    }

	public void attributeAdded(HttpSessionBindingEvent event)  { 
		System.out.println("Attribute Added");
    }
	
}
