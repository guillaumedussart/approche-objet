package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *  test calendar
 *
 */
public class TestCalendar {
    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = new GregorianCalendar(2016,4,19,23,59,30);

        System.out.println("#1. " + sdf.format(calendar.getTime()));
        Date datef = new Date();
        String sdf2fr = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss",Locale.FRANCE).format(datef);
        System.out.println(sdf2fr);
        String sdf2ru = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss",new Locale("RU")).format(datef);
        System.out.println(sdf2ru);
        String sdf2ch = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss",Locale.CHINA).format(datef);
        System.out.println(sdf2ch);
        String sdf2al = new SimpleDateFormat("EEEE, d MMM yyyy HH:mm:ss",Locale.GERMANY).format(datef);
        System.out.println(sdf2al);
    }
}
