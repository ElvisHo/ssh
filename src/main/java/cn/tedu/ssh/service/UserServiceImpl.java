package cn.tedu.ssh.service;

import org.springframework.stereotype.Service;

import cn.tedu.ssh.bean.User;

@Service("userService")
public class UserServiceImpl 
	implements UserService {

	public int register(User user) {
		// ����
		System.out.println("UserServiceImpl.register() -> " + user);
		
		// ��ʱģ�⣬�㶨Ϊע��ɹ�
		return 1;
	}

}
