package treeni.control;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import treeni.model.Jalat;
import treeni.model.OlatKadet;
import treeni.model.RintaOlkaKadet;
import treeni.model.SelkaTakareidet;
import treeni.model.dao.JalkaDAO;
import treeni.model.dao.KasiDAO;
import treeni.model.dao.RintaDAO;
import treeni.model.dao.SelkaDAO;

@WebServlet("/listaa-tulokset")
public class ListaaTuloksetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Luodaan treeniDAO ja haetaan kaikki treenit tietokannasta
		RintaDAO rintadao = new RintaDAO();
		JalkaDAO jalkadao = new JalkaDAO();
		KasiDAO kasidao = new KasiDAO();
		SelkaDAO selkadao = new SelkaDAO();
		ArrayList<RintaOlkaKadet> rintatreenit = rintadao.findAll();
		ArrayList<Jalat> jalkatreenit = jalkadao.findAll();
		ArrayList<OlatKadet> kasitreenit = kasidao.findAll();
		ArrayList<SelkaTakareidet> selkatreenit = selkadao.findAll();
		
			// Talletetaan request-olion alle treenilista, jotta tiedot ovat käytössä jsp:llä
		request.setAttribute("rintaTulokset", rintatreenit);
		request.setAttribute("jalatTulokset", jalkatreenit);
		request.setAttribute("olkaTulokset", kasitreenit);
		request.setAttribute("selkaTulokset", selkatreenit);
		
			// lähetä selaimelta tullut pyyntö servletiltä edelleen jsp:lle
		String jsp = "/view/treenilista.jsp";
		RequestDispatcher dispather = getServletContext().getRequestDispatcher(jsp);
		dispather.forward(request, response);
	}
}
