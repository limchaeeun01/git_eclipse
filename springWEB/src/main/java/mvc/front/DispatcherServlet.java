package mvc.front;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.factory.BeanFactory;
import mvc.util.Controller;
import mvc.util.View;

@WebServlet("*.kdt")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("debug >>> DispatcherServlet");
	    System.out.println("debug >>> client request path : " + request.getRequestURI());

	    BeanFactory factory = BeanFactory.getInstance();
	    Controller ctrl = factory.getController(request.getRequestURI());

	    if (ctrl == null) {
	        System.err.println("No matching controller found for path: " + request.getRequestURI());
	        response.sendError(HttpServletResponse.SC_NOT_FOUND, "The requested resource was not found.");
	        return;
	    }

	    View view = ctrl.execute(request, response);

	    if (view.isFlag()) {
	        RequestDispatcher rd = request.getRequestDispatcher(view.getResponseJSP());
	        rd.forward(request, response);
	    } else {
	        response.sendRedirect(view.getResponseJSP());
	    }
	}

	
}
