import java.util.List;
import java.util.Calendar;
import java.util.Date;
/**
 * Created by User on 23/04/2017.
 */
public class SecurityControlUnit extends ControlUnit {

    @Override
    public void pollSensors() {
        Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        if(hours>=22 || hours<=6){
            super.pollSensors();
        }
    }
}
