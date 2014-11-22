package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw= response.getWriter();
		
		String n=request.getParameter("name");
		//String p=request.getParameter("password");
		
		pw.println(n);
		//pw.println(p);
		
		response.sendRedirect("https://www.google.co.in/");
		
		//RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
		//rd.include(request, response);
	
		pw.close();
	}

}
