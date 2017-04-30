/**
 * Created by User on 23/04/2017.
 */
public class MotionSensor implements SecuritySensor {

    private int call_sequence;
    private String location;
    private Announcement announce;
    private boolean triggered;

    public MotionSensor(String location1){
        this.location = location1;
        announce = new SecurityAnnouncement();
        triggered=false;
        call_sequence=0;
    }

    @Override
    public boolean isTriggered() {
        call_sequence=call_sequence+1;
        if (call_sequence%20==0){
            triggered=true;
            return triggered;
        } else {
            triggered=false;
            return triggered;
        }
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getSensorType() {
        return "Motion sensor";
    }

    @Override
    public String sendNotification(){
        return announce.notification();
    }

}
