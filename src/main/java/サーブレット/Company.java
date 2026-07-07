package サーブレット;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DAO.CompanyDAO;
import DAO.StudentDAO;
import model.ModelCompany;
import model.ModelStudent;

/**
 * Servlet implementation class Company
 */
@WebServlet("/Company")
public class Company extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Company() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO Sdao = new StudentDAO();
		CompanyDAO Cdao = new CompanyDAO();
		
        List<ModelCompany> Companys = Cdao.findAll();
		List<ModelStudent> Cstudents = Sdao.findAllWithCompany(1001);
		
		
		// リストをJSPに引き継ぐ（重要）
		request.setAttribute(" Companys",  Companys);
	    request.setAttribute("Cstudents", Cstudents);
		
		for (ModelStudent s : Cstudents) {
		    System.out.println(s.getGakusekiBango() + " : " + s.getGakusekiBango());
		}
		
		RequestDispatcher dispatcher =
		        request.getRequestDispatcher("/WEB-INF/jsp/Company/CompanyStudent.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
