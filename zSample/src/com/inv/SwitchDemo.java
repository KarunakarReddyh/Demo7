package com.inv;

import java.text.MessageFormat;

public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringBuilder urlString = new StringBuilder("{0}");

		urlString = urlString.append("/eClaims/ClaimantSelfService/");
		System.out.println(urlString);

		String event = "https://qaclaims.farmers.com";
		String result = MessageFormat.format(urlString.toString(), event);

		System.out.println(result);
	}

}
