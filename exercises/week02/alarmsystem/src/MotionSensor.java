/**
 * Created by User on 23/04/2017.
 */
public class MotionSensor implements SecuritySensor {

    private int call_sequence=0;
    private int battery_percentage=100;
    private String location;

    public MotionSensor(String location1){
        this.location = location1;
    }

    @Override
    public boolean isTriggered() {
        call_sequence=call_sequence+1;
        if (call_sequence%20==0 && battery_percentage>0){
            battery_percentage = battery_percentage-10;
            return true;
        } else return false;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getSensorType() {
        return "Motion sensor";
    }

}
