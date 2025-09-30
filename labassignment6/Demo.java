package Assignment6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

//import jakarta.servlet.http.HttpServletResponse;
//import javarta.servlet.*;


@WebServlet("/Demo")  
public class Demo extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("\t<title> Servlet Example</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<b> Hello World!</b>");
		out.println("</body>");
		out.println("</html>");
		
		
}
}

