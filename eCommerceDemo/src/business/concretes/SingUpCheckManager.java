package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.SingUpCheckService;
import eCommerceDemo.entities.concretes.User;

public class SingUpCheckManager implements SingUpCheckService {
	
	List<String> mails = new ArrayList<String>();
	
	
	@Override
	public boolean checkFirstName(User user) {
		
		 	if (user.getFirstName() == null) {
			System.out.println("İsim satırı boş geçilemez.");
			return false;
			
		 	}else if (user.getFirstName().length() < 3) {
		 		System.out.println("İsim en az 3 karakter olmalıdır.");
		 		return false;
		 	} 
		 	
		 	return true;
	}

	@Override
	public boolean checkLastName(User user) {
		
		if (user.getLastName() == null) {
			System.out.println("İsim satırı boş geçilemez.");
			return false;
			
		 	}else if (user.getLastName().length() < 3) {
		 		System.out.println("İsim en az 3 karakter olmalıdır.");
		 		return false;
		 	} 
		 	
		 	return true;
		
	}

	@Override
	public boolean checkPassword(User user) {
		if (user.getPassword()!=user.getRePassword()) {
			System.out.println("Parola ve porala tekrarı aynı olmalıdır.");
			return false;
		}else if (user.getPassword().length() < 6){
			System.out.println("Parola en az 6 karakterden oluşmalıdır.");
			return false;
		}
		return true;
	
	}

	@Override
	public boolean checkEmail(User user) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		 
		
		  Matcher matcher = pattern.matcher(user.getEmail());
		  //System.out.println(user.getEmail() +" : "+ matcher.matches());
		  
		 if (matcher.matches() == false) {
			 System.out.println("Lütfen mail formatına uygun bir mail giriniz");
		 }else if (user.getEmail() == null) {
			 System.out.println("Email alanı boş bırakılamaz.");
			 return false;
		 }
		 
		return true;
	}

	

	@Override
	public boolean matchEmail(User user) {
		
		
		for (String mail : mails) {
			
			if(user.getEmail() == mail) {
				System.out.println("Bu mail daha önce kullanılmıştır");
				return false;
			}
			
		}mails.add(user.getEmail());
			return true;
		
	}
	@Override
	public boolean isValidate(User user) {
		
		if(checkFirstName(user)==true && checkLastName(user)==true && checkPassword(user)==true && checkEmail(user)==true && matchEmail(user)==true) {
			return true;
		}
		
		return false;
	}

}
