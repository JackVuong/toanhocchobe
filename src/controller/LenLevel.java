package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CauHoi;
import database.DbManager;

/**
 * Servlet implementation class LenLevel
 */
@WebServlet("/LenLevel")
public class LenLevel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LenLevel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cautraloi = request.getParameter("ketquachon");
		int kq = Integer.parseInt(cautraloi);
		DbManager manager = new DbManager();
		manager.openConnection();
		List<CauHoi> ListCauHoi = manager.getDSCauHoi2("1");
		if(kq == ListCauHoi.get(define.countGame).getDapAn()) { //kiem tra dap an tra loi dung
			define.point++; // cong len 1 diem.
		}
		define.countGame++;
		if(define.countGame>10-1) {
			define.countGame = 0;
			//define.ketquachon=0;
			response.sendRedirect("kethucbaithi.jsp");
		}
		else {
		response.sendRedirect("lambaithi2.jsp");
		}
	}

}
