package com.garaipenadev.loginapp.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;

import com.garaipenadev.loginapp.vo.User;

/**
 * Servlet Filter implementation class CookieFilter
 */
@WebFilter("/bilsurhbnsijrtioxjHEWRUYN")
public class CookieFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CookieFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String cookieValue;
		HttpServletRequest req = (HttpServletRequest) request;
		if(req.getSession()==null){
			Cookie[] cookies = req.getCookies();
			
			for(Cookie c : cookies){
				if(c.getName().equals("usuario")){
					cookieValue = c.getValue();
					String[] cookieTokens = cookieValue.split("|");
					String decodedName = new String(DatatypeConverter.parseBase64Binary(cookieTokens[0]));
					String decodedPass = new String(DatatypeConverter.parseBase64Binary(cookieTokens[1]));
					User u = new User(decodedName, decodedPass);
					req.getSession().setAttribute("user", u);
					
				}
			}
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
