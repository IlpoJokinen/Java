package treeni.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.SelkaTakareidet;
import treeni.model.dao.SelkaDAO;

@WebServlet("/paivita-selka")
public class PaivitaSelkaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PALAUTTAA SELAIMEEN MUOKKAUS-LOMAKKEEN
		String idSrt = request.getParameter("id");
		int idGet = new Integer(idSrt);
		request.setAttribute("id", idGet);
		String jsp = "/view/paivita-selka.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp); 
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			String idStrRdy = request.getParameter("id");
			int id = new Integer(idStrRdy);
			
			String kulSoutTulos = request.getParameter("kulSout");
			double kulmasoutuTulos = new Double(kulSoutTulos);
			
			String ylaTaljaStr = request.getParameter("ylaTalja");
			double ylaTaljaTulos = new Double(ylaTaljaStr);
			
			String yhdKadenStr = request.getParameter("yhdKaden");
			double yhdKadenSoutuTulos = new Double(yhdKadenStr);
			
			String alataljaStr = request.getParameter("alatalja");
			double alataljaTulos = new Double(alataljaStr);
			
			String sjmvStr = request.getParameter("sjmv");
			double sjmvTulos = new Double(sjmvStr);
			
			String takareisiStr = request.getParameter("takareisi");
			double takareisiTulos = new Double(takareisiStr);
			
			SelkaTakareidet selkatreeni = new SelkaTakareidet(id, kulmasoutuTulos, ylaTaljaTulos, yhdKadenSoutuTulos, alataljaTulos, sjmvTulos,
					takareisiTulos);
			SelkaDAO treenidao = new SelkaDAO();
			treenidao.updateSelkaTakareidet(selkatreeni);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		response.sendRedirect("listaa-tulokset");
	}

}
