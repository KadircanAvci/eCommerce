
import business.concretes.MailVerificationManager;
import business.concretes.SingUpCheckManager;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "ka@outlook.com", "123456", "123456","veli", "dal");
		User user2 = new User(2, "ahmet@outlook.com", "456222", "456222","ahmet", "demir");
		
		UserManager userManager = new UserManager(new SingUpCheckManager(), new HibernateUserDao(),new MailVerificationManager());
		
		
		userManager.signUp(user1);
		userManager.signUp(user2);
		
		userManager.login("ka@outlook.com", "123456");
		userManager.login("ahmet@outlook.com", "456222");
	}

}
