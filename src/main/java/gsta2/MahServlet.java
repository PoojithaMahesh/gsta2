package gsta2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MahServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		String cgst=context.getInitParameter("cgst");
		double cgst1=Double.parseDouble(cgst);
		System.out.println(cgst1);
		
		ServletConfig config=getServletConfig();
		double mahsgst=Double.parseDouble(config.getInitParameter("sgstofmah"));
		System.out.println(mahsgst);
		String karsgst=config.getInitParameter("sgstofkar");
		System.out.println(karsgst);
	}
}
