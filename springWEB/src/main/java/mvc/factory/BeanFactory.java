package mvc.factory;

import java.util.HashMap;
import java.util.Map;
import mvc.util.Controller;
import mvc.ctrl.IndexController;
import mvc.user.ctrl.ErrorController;
import mvc.user.ctrl.JoinController;
import mvc.user.ctrl.ListController;
import mvc.user.ctrl.LoginController;

public class BeanFactory {
	private Map<String, Controller> map;
	public static BeanFactory instance;
	
	private BeanFactory() {
		map = new HashMap();
		map.put("/springWEB/index.kdt", new IndexController());
		map.put("/springWEB/login.kdt", new LoginController());
		map.put("/springWEB/joinForm.kdt", new JoinController());
		map.put("/springWEB/error.kdt", new ErrorController());
		map.put("/springWEB/list.kdt", new ListController());
	}
	
	public static BeanFactory getInstance() {
		if(instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	
	public Controller getController(String path) {
		return map.get(path);
	}
	
}
