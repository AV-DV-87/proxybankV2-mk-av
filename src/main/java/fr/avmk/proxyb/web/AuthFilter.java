package fr.avmk.proxyb.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AuthFilter implements Filter {
public static final String SESSION_AUTH = "auth";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		//recup requete et prendre la session
		final HttpSession session = ((HttpServletRequest)request).getSession();
		
		if(session.getAttribute(SESSION_AUTH) != null) {
			//utilisateur est authentifié
			chain.doFilter(request, response);
		}else {
			//utilisateur inconnu
			((HttpServletResponse)response).sendRedirect("/login");
			// possibilité de message pour traitement AJAX((HttpServletResponse)response).sendError(401, "Veuillez vous authentifier");
		}
	}

	@Override
	public void destroy() {
		
	}
}
