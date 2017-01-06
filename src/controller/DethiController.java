package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.DbManager;
import model.CauHoi;;
/**
 * Servlet implementation class DethiController
 */
@WebServlet("/DethiController")
public class DethiController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DethiController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String action = request.getParameter("action");
		//HttpSession sess = request.getSession();
		//if(action.equals("next"))
		//{
			//int dem = (int)sess.getAttribute("i");
			
			String cautraloi = request.getParameter("ketquachon");
			int kq = Integer.parseInt(cautraloi);
			DbManager manager = new DbManager();
			manager.openConnection();
			List<CauHoi> ListCauHoi = manager.getDSCauHoi1("1");
			if(kq == ListCauHoi.get(define.countGame).getDapAn()) {
				define.point++;
			}
			define.countGame++;
			if(define.countGame>10-1) {
				define.countGame = 0;
				//define.ketquachon=0;
				response.sendRedirect("kethucbaithi.jsp");
			}
			else {
			response.sendRedirect("lambaithi.jsp");
			}
			
		//}
	}

}
