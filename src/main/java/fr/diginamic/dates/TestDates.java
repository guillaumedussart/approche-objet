package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * test dates
 */
public class TestDates {
    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) throws ParseException {
        Date datedujour = new Date();
        String dateformat = new SimpleDateFormat("mm-dd-yyyy").format(datedujour);
        System.out.println(dateformat);
        String dateformat2Date = new SimpleDateFormat("mm-dd-yyyy").format(datedujour);
        String dateformat2Hour = new SimpleDateFormat("HH:mm:ss").format(datedujour);
        StringBuilder strB = new StringBuilder();
        strB.append("date du ").append(dateformat2Date).append(" a ").append(dateformat2Hour);
        System.out.println(strB);
        String strDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(datedujour);
        System.out.println(strDate);
        String strDateHour = new SimpleDateFormat("yyyy/HH").format(datedujour);
        System.out.println(strDateHour);

    }
}
