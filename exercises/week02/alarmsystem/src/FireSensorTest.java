import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireSensorTest {

  @Test
  public void testThatIsTriggeredReturnsFalse() {
    FireSensor sensor = new FireSensor("Lobby");
    boolean isTriggered = sensor.isTriggered();
    assertEquals(false, isTriggered);
  }

  @Test
  public void testThatGetLocationReturnsNull() {
    FireSensor sensor = new FireSensor("Lobby");
    String location = sensor.getLocation();
    assertEquals("Lobby", location);
  }

  @Test
  public void testThatGetSensorTypeReturnsNull() {
    FireSensor sensor = new FireSensor("Lobby");
    String sensorType = sensor.getSensorType();
    assertEquals("Fire sensor", sensorType);
  }

  @Test
  public void testThatGetBatteryPercentageReturnsNegativeOne() {
    FireSensor sensor = new FireSensor("Lobby");
    double batteryPercentage = sensor.getBatteryPercentage();
    assertEquals(0.90, batteryPercentage);
  }

  @Test
  public void testsendNotification() {
    FireSensor sensor = new FireSensor("Lobby");
    String hazardAnnounced = sensor.sendNotification();
    assertEquals("Fire Department called, Owner called, Control unit alarm siren triggered",hazardAnnounced );
  }
}