package fr.avmk.proxyb.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avmk.proxyb.business.CompteService;
import fr.avmk.proxyb.domain.Compte;

public class ListeCompteServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//appel à compte Service
	CompteService cpteser = new CompteService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//défini une liste de compte en session pour la rendre accessible à la JSP
		
		List<Compte> results = new ArrayList<Compte>();
		results = cpteser.findAll();
		req.getSession().setAttribute("listeCompte", results);
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/liste-compte.jsp").forward(req, resp);
	}
	
}
