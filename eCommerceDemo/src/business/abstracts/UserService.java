package business.abstracts;

import java.util.List;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void login (String mail, String password);
	
	
}
