package fr.avmk.proxyb.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avmk.proxyb.business.ConseillerService;

public class LoginServlet extends HttpServlet {
	
	ConseillerService conserv = new ConseillerService();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		
		//Envoyer le login récupérer le conseiller
		
		if(login == conserv.findByLog(login).getLogin() && password == conserv.findByLog(login).getPassword()) {
			//redirige vers la page qui permet d'afficher les clients du conseiller connécté
			resp.sendRedirect(this.getServletContext().getContextPath() + "/liste-clients");
			//attribut une valeur à à la constante SESSION AUTH et inscrit là en session
			req.getSession().setAttribute(AuthFilter.SESSION_AUTH, login);

		}
		//si pas de correspondance mettre l'attribut à null
		else {
			req.getSession().setAttribute(AuthFilter.SESSION_AUTH, null);
		}
		
	}

}
