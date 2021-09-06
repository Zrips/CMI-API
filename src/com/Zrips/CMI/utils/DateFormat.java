package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.Zrips.CMI.CMI;

public class DateFormat {
    public static String MiliToDate(long currentTime) {
	return MiliToDate(currentTime, CMI.getInstance().getConfigManager().getLongDateFormat());
    }

    public static String MiliToDate(long currentTime, String format) {
	SimpleDateFormat formatter = new SimpleDateFormat(format);
	Calendar calendar = Calendar.getInstance();
	calendar.setTimeInMillis(currentTime);
	return formatter.format(calendar.getTime());
    }

    public static String MiliToDateShort(long currentTime) {
	SimpleDateFormat formatter = new SimpleDateFormat(CMI.getInstance().getConfigManager().getShortDateFormat());
	Calendar calendar = Calendar.getInstance();
	calendar.setTimeInMillis(currentTime);
	return formatter.format(calendar.getTime());
    }

    public static String MiliToHours(long currentTime) {
	SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
	Calendar calendar = Calendar.getInstance();
	calendar.setTimeInMillis(currentTime);
	return formatter.format(calendar.getTime());
    }

    public static int[] splitToComponentDate(Long biggys) {
	Calendar calendar = Calendar.getInstance();
	calendar.setTimeInMillis(biggys);
	int mYear = calendar.get(Calendar.YEAR);
	int mMonth = calendar.get(Calendar.MONTH);
	int mDay = calendar.get(Calendar.DAY_OF_MONTH);
	int[] ints = { mYear, mMonth, mDay };
	return ints;
    }

    public static int[] splitToComponentTimes(Long biggys) {
	int biggy = (int) (System.currentTimeMillis() - biggys) / 1000;
	int hours = biggy / 3600;
	int mins = (biggy % 3600) / 60;
	int secs = biggy % 60;

	int[] ints = { hours, mins, secs };
	return ints;
    }
}
