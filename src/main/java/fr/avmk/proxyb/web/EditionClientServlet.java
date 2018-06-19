package fr.avmk.proxyb.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.avmk.proxyb.business.ClientService;
import fr.avmk.proxyb.domain.Client;

public class EditionClientServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	ClientService sercli = new ClientService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id = null;
		Client clientmodif = new Client();
		//1 récupérer l'id passé en GET
		id = Integer.parseInt(req.getParameter("client"));
		//2 récupérer le client correspondant
		clientmodif = sercli.findById(id);
		req.setAttribute("id", id);
		req.setAttribute("nom", clientmodif.getNom());
		req.setAttribute("prenom", clientmodif.getPrenom());
		req.setAttribute("email", clientmodif.getEmail());
		req.setAttribute("adresse", clientmodif.getAdresse());
		req.setAttribute("codep", clientmodif.getCode());
		req.setAttribute("ville", clientmodif.getVille());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/edition-client.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//utilise la méthode de recupération de modif
		recupModif(req, resp);
		//redirige vers la page qui permet d'afficher les clients du conseiller connécté
		resp.sendRedirect(this.getServletContext().getContextPath() + "/liste-client");
	}
	
	protected void recupModif(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		//récupère ce qui a été POST par le formulaire
		int id=Integer.parseInt(req.getParameter("id"));
		String nom=req.getParameter("nom");
		String prenom=req.getParameter("prenom");
		String email=req.getParameter("email");
		String adresse=req.getParameter("adresse");
		String codep=req.getParameter("codep");
		String ville=req.getParameter("ville");
		
		//passe à la couche service
		sercli.updateClient(id, nom, prenom, email, adresse, codep, ville);
		
	}
}
