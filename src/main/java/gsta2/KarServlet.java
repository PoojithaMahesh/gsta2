package gsta2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class KarServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ServletContext context=getServletContext();
	String cgst=context.getInitParameter("cgst");
	double cgst1=Double.parseDouble(cgst);
	
	ServletConfig config=getServletConfig();
	double sgstofkar=Double.parseDouble(config.getInitParameter("sgstofkar"));
	
	System.out.println(cgst1);
	System.out.println("kar gst is++"+sgstofkar);
	
	
	
	
	
	}
}
