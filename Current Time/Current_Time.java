/*
*
*  @author dev
*  @since 2020-07-28
*
*  Simple program that uses the SimpleDateformat and Date class instances
*  to output certain forms of Time displayed on clocks
*
*/

import java.text.SimpleDateFormat;
import java.util.Date;


public class CurrentTime {

    public static void main(String[] args) {
        
        Date currentDate = new Date();
        System.out.println(currentDate);


        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");          // hour: min: sec
        System.out.println(timeFormat.format(currentDate));


        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");        // month: day: year
        System.out.println(dateFormat.format(currentDate));
        
        
        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");      // formats in day of the week (EEEE)
        System.out.println(dayOfTheWeekFormat.format(currentDate));


        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");          //formats in hour in am/pm (h): minute in hour (mm): AM/PM marker (a)
        System.out.println(clockFormat.format(currentDate));
    }
}
