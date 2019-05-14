package treeni.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.OlatKadet;
import treeni.model.dao.KasiDAO;

@WebServlet("/lisaa-kasi")
public class LisaaUusiKasiServlet extends HttpServlet {
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
			
			String pystPunStr = request.getParameter("pystPun");
			double pystPunnerTulos = new Double(pystPunStr);
			
			String takaolatStr = request.getParameter("takaolat");
			double takaolatTulos = new Double(takaolatStr);
			
			String vipariSivStr = request.getParameter("vipariSiv");
			double vipariSivTulos = new Double(vipariSivStr);
			
			String ojenTaljStr = request.getParameter("ojenTalj");
			double ojentajaTaljaTulos = new Double(ojenTaljStr);
			
			String hauisScottStr = request.getParameter("hauisScott");
			double hauisScottTulos = new Double(hauisScottStr);
			
			String ojenPunStr = request.getParameter("ojenPun");
			double ojentajaPunnerTulos = new Double(ojenPunStr);
			
			String hauisKPStr = request.getParameter("hauisKP");
			double hauisKPTulos = new Double(hauisKPStr);
			
			OlatKadet kasitreeni = new OlatKadet(id, pystPunnerTulos, takaolatTulos, vipariSivTulos, ojentajaTaljaTulos, hauisScottTulos,
					ojentajaPunnerTulos, hauisKPTulos);
			KasiDAO treenidao = new KasiDAO();
			treenidao.addOlatKadet(kasitreeni);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		response.sendRedirect("listaa-tulokset");
	}

}
