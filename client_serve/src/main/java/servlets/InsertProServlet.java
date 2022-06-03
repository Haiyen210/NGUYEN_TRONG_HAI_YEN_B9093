package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;

import entity.Product;
/**
 * Servlet implementation class InsertProServlet
 */
@WebServlet("/InsertProServlet")
public class InsertProServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//khai báo url service
		String url="http://localhost:8080/Resful_Lesson_One/project/san-pham";
		//tạo đối tượng client để get data từ service
		Client client=Client.create();
		//láy dwxl iệu từ form
		String CountryName=request.getParameter("CountryName");
		String Position=request.getParameter("Position");
		String Area=request.getParameter("Area");
		int Population=Integer.valueOf(request.getParameter("Population"));
		
		Product p=new Product( CountryName, Position, Area, Population);
		Gson gson=new Gson();
		String datajson=gson.toJson(p);
		//post data
		String result=client.resource(url).header("Content-Type", "application/json;charset=UTF8").post(String.class,datajson);
		//chuyển hướng
		response.sendRedirect("/client_serve");
	}

}
