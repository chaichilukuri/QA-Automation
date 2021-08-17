package com.crm.util;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtil {
	
	public static int generateRandomNumber() {
		int rand_number = ThreadLocalRandom.current().nextInt();
		return rand_number;
	}
	
	public static String generateRandomName() {
		byte[] arrStr = new byte[8];
		new Random().nextBytes(arrStr);
		
		String ranName = new String(arrStr, Charset.forName("UTF-8"));
		return ranName;
		
	}
	

}
