import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.tedu.ssh.bean.User;

public class HibernateTester {

	@Test
	public void addUser() {
		// 1.1. ����Configuration����
		Configuration cfg
			= new Configuration();
		// 1.2. ��ȡ�����ļ�
		cfg.configure("hibernate.cfg.xml");
		
		// 2.1. ���SessionFactory
		SessionFactory factory
			= cfg.buildSessionFactory();
		// 2.2. ��ȡSession����
		Session session
			= factory.openSession();
		
		// 3.1. ������Ҫ�����User����
		User user = new User(
			"Billy",
			"billy1234",
			"13800138002",
			"billy@tedu.cn"
		);
		
		// 4.1. ִ��
		Integer id = (Integer) session.save(user);
		
		// 5.1. �ͷ���Դ
		session.close();
		
		// ���
		System.out.println("addUser() -> id=" + id);
	}
	
}
