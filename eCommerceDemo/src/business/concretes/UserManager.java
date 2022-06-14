package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.MailVerificationService;
import business.abstracts.SingUpCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;


public class UserManager implements UserService {

	SingUpCheckService singUpCheckService;
	UserDao userDao;
	MailVerificationService mailVerificationService;
	
	
	
	
	public UserManager (SingUpCheckService singUpCheckService, UserDao userDao,MailVerificationService mailVerificationService) {
		this.singUpCheckService = singUpCheckService;
		this.userDao = userDao;
		this.mailVerificationService = mailVerificationService;
	}
	
	
	
	@Override
	public void signUp(User user) {
		
		if(singUpCheckService.isValidate(user) == true) {
			System.out.println("Kullanıcı sisteme kayıt edilebilir.");
			mailVerificationService.sendToVerifyMail(user.getEmail());
			userDao.singUp(user);
			return;
		}
	 
			
	}
		
	
	@Override
	public void login(String mail, String password) {
		
		if(mail==null || password==null) {
			System.out.println("Mail ve parola alanlarının doldurulması zorunludur.");
			return;
		}else {
			System.out.println("Giriş başarılı");
		}
			
	}


	

	

}
