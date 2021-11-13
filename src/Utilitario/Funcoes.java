package Utilitario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Funcoes {

    public static Calendar stringToDate(String sData) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = sdf.parse(sData);
        Calendar retorno = Calendar.getInstance();
        retorno.setTime(data);

        return retorno;
    }

    public static String dateToString(Calendar C) {
        Date data = C.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    public static Calendar toCalendar(Date date) {
        TimeZone zone = TimeZone.getTimeZone("GMT-03:00");
        Locale locale = new Locale("pt", "BR");
        Calendar c = Calendar.getInstance(zone, locale);
        c.setTime(date);
        return c;
    }
}
