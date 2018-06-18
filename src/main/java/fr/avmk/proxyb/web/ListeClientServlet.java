package fr.avmk.proxyb.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avmk.proxyb.business.ClientService;

public class ListeClientServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ClientService cliser = new ClientService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//request.getSession(true).setAttribute("listArticle", ArticleService.getSingleton().getArticles());
		req.getSession(true).setAttribute("listeClient", cliser.findAllClient());
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/liste-client.jsp").forward(req, resp);
	}
	
}
