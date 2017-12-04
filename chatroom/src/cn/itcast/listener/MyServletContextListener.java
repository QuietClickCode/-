package cn.itcast.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;

import cn.itcast.vo.User;

public class MyServletContextListener implements ServletContextListener{
	//ServletContext对象创建下面方法就执行
	//ServletContextEvent事件对象
	public void contextInitialized(ServletContextEvent sce) {
		Map<User,HttpSession> userMap=new HashMap<User,HttpSession>();
		sce.getServletContext().setAttribute("userMap", userMap);
		
	}
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	

}
