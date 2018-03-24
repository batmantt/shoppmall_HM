package com.gb.utils;


import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ToolUtil {

	
	public static String dateFormate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
	
	public static Date stringToDate(String dstr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = new Date(sdf.parse(dstr).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
		
	}
	public static java.sql.Timestamp currentTime() {
		java.util.Date date = new java.util.Date();
		Timestamp timeStamp = new Timestamp(date.getTime());
		return timeStamp;
	}
}
