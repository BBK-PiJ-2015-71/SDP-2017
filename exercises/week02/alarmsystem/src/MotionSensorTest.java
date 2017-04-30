/**
 * Created by User on 30/04/2017.
 */

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotionSensorTest {
    @Test
    public void testThatIsTriggeredReturnsFalse() {
        MotionSensor sensor = new MotionSensor("Auditorium");
        boolean isTriggered = sensor.isTriggered();
        assertEquals(false, isTriggered);
    }

    @Test
    public void testThatGetLocationReturnsNull() {
        MotionSensor sensor = new MotionSensor("Auditorium");
        String location = sensor.getLocation();
        assertEquals("Auditorium", location);
    }

    @Test
    public void testThatGetSensorTypeReturnsNull() {
        MotionSensor sensor = new MotionSensor("Auditorium");
        String sensorType = sensor.getSensorType();
        assertEquals("Motion sensor", sensorType);
    }

    @Test
    public void testsendNotification() {
        MotionSensor sensor = new MotionSensor("Auditorium");
        String securityAnnounced = sensor.sendNotification();
        assertEquals("Owner called, Control unit alarm siren triggered",securityAnnounced );
    }
}
