package com.niit.supportclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralSupport {

	public static String getDate() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateobj = new Date();
		String date = df.format(dateobj).toString();
		return date;
	}

}
