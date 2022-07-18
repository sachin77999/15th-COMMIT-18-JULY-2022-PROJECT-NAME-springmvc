package springmvc.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	public int createUser(User user)
	{
	return this.userDao.saveUser(user);	
	}
}
