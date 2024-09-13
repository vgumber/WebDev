import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/annotation")
public class WelcomeServlet extends HttpServlet{
	public static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.print("Hello");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			         throws ServletException,IOException{
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.append("Welcome "+firstName+" "+lastName+"!");
		writer.close();
		
	}
	@Override
	public void destroy() {
		System.out.print("I am ending");
	}
	

}
