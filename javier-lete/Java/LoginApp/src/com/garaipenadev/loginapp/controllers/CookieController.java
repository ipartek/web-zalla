package com.garaipenadev.loginapp.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import com.garaipenadev.loginapp.vo.User;

/**
 * Servlet implementation class CookieController
 */
@WebServlet("/hghghghghghghgh")
public class CookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cookieValue;
		if(request.getSession()==null){
			Cookie[] cookies = request.getCookies();
			
			for(Cookie c : cookies){
				if(c.getName().equals("usuario")){
					cookieValue = c.getValue();
					String[] cookieTokens = cookieValue.split("|");
					String decodedName = new String(DatatypeConverter.parseBase64Binary(cookieTokens[0]));
					String decodedPass = new String(DatatypeConverter.parseBase64Binary(cookieTokens[1]));
					User u = new User(decodedName, decodedPass);
					request.getSession().setAttribute("user", u);
					
				}
			}
		}
	}

}
