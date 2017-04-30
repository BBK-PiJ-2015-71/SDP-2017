/**
 * Created by User on 23/04/2017.
 */
public interface SecuritySensor {
    boolean isTriggered();

    String getLocation();

    String getSensorType();

}
