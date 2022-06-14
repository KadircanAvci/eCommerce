package dataAccess.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserDao {
	
	void singUp(User user);
	void login(User user);
	void delete(User user);
	void update(User user);
	boolean getEmail(String email);
	boolean getPassword(String email);
	
}
