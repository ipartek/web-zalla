package com.garaipenadev.loginapp.filters;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import com.garaipenadev.loginapp.vo.User;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter("/private/*")
public class Filter implements javax.servlet.Filter {

	public Filter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String cookieValue;
		HttpServletRequest req = (HttpServletRequest) request;
		User u;
		if (req.getSession() == null) {
			Cookie[] cookies = req.getCookies();

			for (Cookie c : cookies) {
				if (c.getName().equals("usuario")) {
					System.out.println("Hay cookie");
					cookieValue = c.getValue();
					String[] cookieTokens = cookieValue.split("|");
					String decodedName = new String(DatatypeConverter.parseBase64Binary(cookieTokens[0]));
					String decodedPass = new String(DatatypeConverter.parseBase64Binary(cookieTokens[1]));
					User user = new User(decodedName, decodedPass);
					req.getSession().setAttribute("user", user);
					chain.doFilter(request, response);
				}
			}
		} else {

			u = (User) req.getSession().getAttribute("user");

			if (u != null) {
				chain.doFilter(request, response);
			} else {
				((HttpServletResponse) response).sendRedirect("../index.jsp");
			}
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
