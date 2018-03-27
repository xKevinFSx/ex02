package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.PaisService;
import model.Pais;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			doPost(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		long pPopulacao = request.getParameter("populacao");
		double pArea = request.getParameter("area");
		
			Pais pais = new Pais();
			pais.setNome(pNome);
			pais.setPopulacao(pPopulacao);
			pais.setArea(pArea);
			
			PaisService cs = new PaisService();
			cs.criar(pais);
			pais = cs.carregar(pais.getId());
			
			PrintWriter out = response.getWriter();
			out.println("<html><head><title>Pais Cadastrado</title></head><body>");
			out.println(	"id: "+pais.getId()+"<br>");
			out.println(	"nome: "+pais.getNome()+"<br>");
			out.println(	"populacao: "+pais.getPopulacao()+"<br>");
			out.println(	"area: "+pais.getArea()+"<br>");
		    out.println("</body></html>");
			
				doGet(request, response);
	}

}
