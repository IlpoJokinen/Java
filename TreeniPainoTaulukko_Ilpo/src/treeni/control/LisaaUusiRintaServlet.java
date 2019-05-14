package treeni.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.RintaOlkaKadet;
import treeni.model.dao.RintaDAO;

@WebServlet("/lisaa-rinta")
public class LisaaUusiRintaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String jsp = "/view/tuloslomake.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp); 
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			// Haetaan lomakkeella syötetyn treenin tiedot request-oliolta
			String idStr = request.getParameter("id");
			int id = new Integer(idStr);
			
			String penkkiStr = request.getParameter("penkki");
			double penkkiTulos = new Double(penkkiStr);
			
			String vinopenkkiStr = request.getParameter("vinopenkki");
			double vinopenkkiTulos = new Double(vinopenkkiStr);
			
			String ristitaljaStr = request.getParameter("ristitalja");
			double ristitaljaTulos = new Double(ristitaljaStr);
			
			String flyesStr = request.getParameter("flyes");
			double flyesTulos = new Double(flyesStr);
			
			String takaolkaStr = request.getParameter("takaolka");
			double takaolkaTulos = new Double(takaolkaStr);
			
			String vipariSStr = request.getParameter("vipariS");
			double vipariSTulos = new Double(vipariSStr);
			
			String vipariEStr = request.getParameter("vipariE");
			double vipariETulos = new Double(vipariEStr);
			
			String kapPenkkiStr = request.getParameter("kapPenkki");
			double kapPenkkiTulos = new Double(kapPenkkiStr);
			
			String hauiskaantoStr = request.getParameter("hauiskaanto");
			double hauiskaantoTulos = new Double(hauiskaantoStr);
		
			// Luodaan uusi treeni edellisillä parametreillä
			RintaOlkaKadet rintatreeni = new RintaOlkaKadet(id, penkkiTulos, vinopenkkiTulos, ristitaljaTulos, flyesTulos, takaolkaTulos, vipariSTulos,
					vipariETulos, kapPenkkiTulos, hauiskaantoTulos);
		
			//Luodaan treenidao
			RintaDAO treenidao = new RintaDAO();
			//Lisätään treenin tiedot tietokantaan
			treenidao.addRintaOlkaKadet(rintatreeni); 
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		//uudelleenohjataan selain treenilistan tuottavalle Servletille!
		response.sendRedirect("listaa-tulokset");
	}
}
