package cn.tedu.ssh.service;

import org.springframework.stereotype.Service;

import cn.tedu.ssh.bean.User;

@Service("userService")
public class UserServiceImpl 
	implements UserService {

	public int register(User user) {
		// 测试
		System.out.println("UserServiceImpl.register() -> " + user);
		
		// 暂时模拟，恒定为注册成功
		return 1;
	}

}
