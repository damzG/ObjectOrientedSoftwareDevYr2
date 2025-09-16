import java.util.Calendar;

public class Clock {
    //This is lab3aq1
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Time now = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        long starting = System.currentTimeMillis();
        long currentTime = starting;
        int oldMin = cal.get(Calendar.MINUTE);
        int newMin  = oldMin;
        
        while(newMin == oldMin){
            while((currentTime - starting) < 1000){
                currentTime = System.currentTimeMillis();
            }
            now.tick();
            System.out.println(now.toString());
            newMin = now.getMinute();
            starting = System.currentTimeMillis();
            currentTime = starting;
        }
        
    }    
}
