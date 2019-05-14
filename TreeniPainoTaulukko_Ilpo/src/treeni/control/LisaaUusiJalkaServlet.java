package treeni.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.Jalat;
import treeni.model.dao.JalkaDAO;

@WebServlet("/lisaa-jalka")
public class LisaaUusiJalkaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String jsp = "/view/tuloslomake.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp); 
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String idStr = request.getParameter("id");
			int id = new Integer(idStr);
			
			String kyykkyStr = request.getParameter("kyykky");
			double kyykkyTulos = new Double(kyykkyStr);
			
			String hackStr = request.getParameter("hack");
			double hackTulos = new Double(hackStr);
			
			String prassiStr = request.getParameter("prassi");
			double prassiTulos = new Double(prassiStr);
			
			String takreiStr = request.getParameter("takareidet");
			double takareidetTulos = new Double(takreiStr);
			
			String askKavelStr = request.getParameter("askKavel");
			double askKavelTulos = new Double(askKavelStr);
			
			String pohkeetStr = request.getParameter("pohkeet");
			double pohkeetTulos = new Double(pohkeetStr);
			
			Jalat jalkatreeni = new Jalat(id, kyykkyTulos, hackTulos, prassiTulos, takareidetTulos, askKavelTulos, pohkeetTulos);
			JalkaDAO treenidao = new JalkaDAO();
			treenidao.addJalat(jalkatreeni);
		} catch(SQLException e) {
			throw new RuntimeException(e);
		} 
		response.sendRedirect("listaa-tulokset");
	}
}
