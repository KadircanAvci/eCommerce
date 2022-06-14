package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

	
	@Override
	public void sendToVerifyMail(String email) {
		System.out.println("Doğrulama maili gönderildi");
		
	}



	
}
