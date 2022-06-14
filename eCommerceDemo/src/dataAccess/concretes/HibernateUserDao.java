package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void singUp(User user) {
		System.out.println("Hibernate ile eklendi");
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getPassword(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
