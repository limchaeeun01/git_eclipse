package mvc.user.ctrl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.user.domain.UserRequestDTO;
import mvc.user.domain.UserResponseDTO;
import mvc.user.service.UserService;
import mvc.util.Controller;
import mvc.util.View;

public class LoginController implements Controller {
	
	private UserService service;
	
	public LoginController() {
		service = new UserService();
	}

	@Override
	public View execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("debug >>> LoginController execute");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("params id, pwd " + id + "\t" + pwd);
		
		UserRequestDTO requestUser = new UserRequestDTO();
		requestUser.setId(id);
		requestUser.setPwd(pwd);
		
		UserResponseDTO responseUser = service.login(requestUser);
		View view = new View();
		
		if(responseUser != null) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", responseUser);
			
			view.setFlag(true);
			view.setResponseJSP("./main.jsp");
		}else {
			view.setFlag(true);
			view.setResponseJSP("./error.jsp");
		}
		
		return null;
	}

}
