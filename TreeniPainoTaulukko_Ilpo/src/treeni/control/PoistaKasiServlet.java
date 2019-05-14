package treeni.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.dao.KasiDAO;

@WebServlet("/poista-kasi")
public class PoistaKasiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			//Haetaan lomakkeella sy�tetyn treenin tiedot request-oliolta
			String idStr = request.getParameter("id");
			int id = new Integer(idStr);
			//Luodaan treenidao
			KasiDAO treenidao = new KasiDAO();
			//Poistetaan henkil�n tiedot tietokannasta:
			treenidao.removeOlatKadet(id);
		} catch (SQLException e) {
			System.out.println("Sovelluksessa tapahtui virhe " + e.getMessage());
		} 
		//uudelleenohjataan selain treenitaulukko-sivulle
		response.sendRedirect("listaa-tulokset");
	}
}
