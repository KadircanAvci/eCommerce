package business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface SingUpCheckService {
	
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkPassword(User user);
	boolean checkEmail(User user);
	boolean matchEmail(User user);
	boolean isValidate(User user);
}
