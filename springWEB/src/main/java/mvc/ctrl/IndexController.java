package mvc.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.util.Controller;
import mvc.util.View;



public class IndexController implements Controller {

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> IndexController execute");
		
		View view = new View();
		view.setResponseJSP("main.jsp");
		view.setFlag(true);
		return view;
	}


}
