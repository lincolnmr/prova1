package Facade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncoesData {
    
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
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        return c;
    }

    public static String now() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(cal.getTime());
    }

    public static String somaUmAno(){ 
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            cal.setTime(sdf.parse(now()));
        } catch (ParseException ex) {
            Logger.getLogger(FuncoesData.class.getName()).log(Level.SEVERE, null, ex);
        }
        cal.add(Calendar.DATE, 365);

        return sdf.format(cal.getTime());
    }
}
