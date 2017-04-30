
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmokeSensorTest {

  @Test
  public void testThatIsTriggeredReturnsFalse() {
    SmokeSensor sensor = new SmokeSensor("Auditorium");
    boolean isTriggered = sensor.isTriggered();
    assertEquals(false, isTriggered);
  }

  @Test
  public void testThatGetLocationReturnsNull() {
    SmokeSensor sensor = new SmokeSensor("Auditorium");
    String location = sensor.getLocation();
    assertEquals("Auditorium", location);
  }

  @Test
  public void testThatGetSensorTypeReturnsNull() {
    SmokeSensor sensor = new SmokeSensor("Auditorium");
    String sensorType = sensor.getSensorType();
    assertEquals("Smoke sensor", sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageReturnsNegativeOne() {
    SmokeSensor sensor = new SmokeSensor("Auditorium");
    double batteryPercentage = sensor.getBatteryPercentage();
    assertEquals(0.8, batteryPercentage, 0.8);
  }

  @Test
  public void testsendNotification() {
      SmokeSensor sensor;
      sensor = new SmokeSensor("Auditorium");
      String hazardAnnounced = sensor.sendNotification();
      assertEquals("Fire Department called, Owner called, Control unit alarm siren triggered",hazardAnnounced );
  }
}
