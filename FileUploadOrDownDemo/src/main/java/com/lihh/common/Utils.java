package com.lihh.common;

import java.util.Calendar;
import java.util.Date;

public final class Utils {

    public static String getCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();

        calendar.setTime(date);

        Integer year = calendar.get(Calendar.YEAR);
        Integer month = calendar.get(Calendar.MONTH) + 1;
        Integer day = calendar.get(Calendar.DAY_OF_MONTH);
        return year + "-" + month + "-" + day;
    }
}
