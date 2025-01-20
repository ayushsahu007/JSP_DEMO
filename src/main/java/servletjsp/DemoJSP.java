package servletjsp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoJSP extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int receivedId = Integer.parseInt(req.getParameter("userId"));
		String receivedName = req.getParameter("userName");
		
		req.setAttribute("Key1", receivedId); //What 
		req.setAttribute("key2", receivedName); //What 
		
		RequestDispatcher rd = req.getRequestDispatcher("output.jsp"); //Where
		
		rd.forward(req, res);
		System.out.println("Back to Current Servlet");
		

}
}
