import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.tedu.ssh.bean.User;

public class HibernateTester {

	@Test
	public void addUser() {
		// 1.1. 创建Configuration对象
		Configuration cfg
			= new Configuration();
		// 1.2. 读取配置文件
		cfg.configure("hibernate.cfg.xml");
		
		// 2.1. 获得SessionFactory
		SessionFactory factory
			= cfg.buildSessionFactory();
		// 2.2. 获取Session对象
		Session session
			= factory.openSession();
		
		// 3.1. 创建需要保存的User对象
		User user = new User(
			"Billy",
			"billy1234",
			"13800138002",
			"billy@tedu.cn"
		);
		
		// 4.1. 执行
		Integer id = (Integer) session.save(user);
		
		// 5.1. 释放资源
		session.close();
		
		// 输出
		System.out.println("addUser() -> id=" + id);
	}
	
}
