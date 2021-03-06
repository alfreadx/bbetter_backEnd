package com.future.bbetter.authentication.password;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 用於密碼的明碼加密與驗證
 * @author Charles
 * @date 2017年9月2日 下午2:40:10
 */
public class Password {
    public static PasswordEncoder encoder = new BCryptPasswordEncoder();
    private static final int workload = 12;
    
    /**
	 * 將密碼(明碼)加密
	 * @author Charles
	 * @date 2017年9月2日 下午2:49:04
	 * @param plaintextPassword
	 * @return String
	 */
    public static String encrypt(String plaintextPassword) {
    	//BCrypt內部已用SecureRandom隨機產生內部salt，所以每次加密結果都不一樣
        String salt = BCrypt.gensalt(workload);
        String hashed_password = BCrypt.hashpw(plaintextPassword, salt);
        return(hashed_password);
    }
    
    /**
	 * 驗證密碼(明碼)與加密過的密碼是否一樣
	 * @author Charles
	 * @date 2017年9月2日 下午2:49:54
	 * @param param1 type 描述
	 * @return boolean
	 */
    public static boolean isValidatePassword(String password, String hashPassword) {
        return BCrypt.checkpw(password, hashPassword);
    }
    
    public static String createRandomPassword() {
    	StringBuilder result = new StringBuilder(); 
    	final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    final int N = alphabet.length();

	    Random r = new Random();
	    int length = 10;
	    
	    for (int i = 0; i < length; i++) {
	    	result.append(alphabet.charAt(r.nextInt(N)));
	    }
    	return result.toString();
    }
    
    /**
	 * 測試
	 * @author Charles
	 * @date 2017年9月2日 下午2:41:03
	 */
    public static void main(String[] args) {
    	//test
//        String tmp = "0000";	//$2a$12$dQevIWsWVAVrkzFDk6Z2LOPJWpsNGEEbkFqbltCrQ3kYXuLn2HEpC
//        String encryptor  = encrypt(tmp);
//        System.out.println("tmp:" + tmp + ", encryptor:" + encryptor );
//        // 1.$2a$12$zgGaBVDiZK7ffB52AnD.U.FbrQ2EmOBONZOHXUoN3V/e4lgCncfBa
//        // 2.$2a$12$14L9HfHMbf23a1FBQL1HkujhBPhKRPtPFdwf5qB70EhEiibmByg5y
//        boolean isValidatePassword = isValidatePassword( tmp, encryptor);
//        System.out.println("isValidatePassword:" + isValidatePassword);
//        System.out.println("----------");
//        String method = "getUserId";
//        String MethodOfSetOrGet = (method.toString()).substring(0, 3);
//		String property = (method.toString()).substring(3, 4).toLowerCase() + (method.toString()).substring(4);
//		
//		System.out.println("MethodOfSetOrGet:" + MethodOfSetOrGet);
//		System.out.println("property:" + property);
		
//    	String result = createRandomPassword();
//    	System.out.println("test:" +  result);
    	
    	
    	String birthdayStr = "03/14/1992";
		String[] birthdayArray = birthdayStr.split("/");
		String birthdayFormate = birthdayArray[2] + "/"+ birthdayArray[0] + "/" + birthdayArray[1];
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date birthday = formatter.parse(birthdayFormate);
			System.out.println("1:" + birthday);
			
			Date birthday2 = formatter.parse(birthdayStr);
			System.out.println("2:" + birthday2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
    }
}